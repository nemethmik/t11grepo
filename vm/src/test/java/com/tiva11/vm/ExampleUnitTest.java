package com.tiva11.vm;

import android.util.Log;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    public static void randomDelay(float min, float max){
        int random = (int)(max * Math.random() + min);
        sleepAsync(random);
    }
    public static void sleepAsync(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
    // From https://dzone.com/articles/20-examples-of-using-javas-completablefuture
    @Test
    public void example07_AsynchronouslyConsumingTheResultOfThePreviousStage() {
        StringBuilder result = new StringBuilder();
        CompletableFuture<Void> cf = CompletableFuture.completedFuture("thenAcceptAsync message")
                .thenAcceptAsync(str -> result.append(str));
        cf.join();
        System.out.println("example07_AsynchronouslyConsumingTheResultOfThePreviousStage: " + result);
        assertTrue("Result was empty", result.length() > 0);
    }
    @Test
    public void example19_allOfAsyncExample() {
        StringBuilder result = new StringBuilder();
        List<String> messages = Arrays.asList("a", "b", "c");
        List<CompletableFuture<String>> futures = messages.stream()
                .map(msg -> CompletableFuture.completedFuture(msg).thenApplyAsync(s -> delayedUpperCase(s)))
                .collect(Collectors.toList());
        CompletableFuture<Void> allOf = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
                .whenComplete((v, th) -> {
                    futures.forEach(cf -> assertTrue(isUpperCase(cf.getNow(null))));
                    result.append("done");
                });
        allOf.join();
        assertTrue("Result was empty", result.length() > 0);
    }
    private static String delayedUpperCase(String s) {
        randomSleep();
        return s.toUpperCase();
    }

    private static String delayedLowerCase(String s) {
        randomSleep();
        return s.toLowerCase();
    }
    private static boolean isUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    static Random random = new Random();
    private static void randomSleep() {
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            // ...
        }
    }

    private static void sleepEnough() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // ...
        }
    }
    // Example from https://github.com/manouti/completablefuture-examples/tree/master/src/main/java/com/example/completablefuture
    // Explanation https://dzone.com/articles/20-examples-of-using-javas-completablefuture
    public static class Car {
        int id;
        int manufacturerId;
        String model;
        int year;
        float rating;
        public Car(int id, int manufacturerId, String model, int year) {
            this.id = id;
            this.manufacturerId = manufacturerId;
            this.model = model;
            this.year = year;
        }
        void setRating(float rating) {
            this.rating = rating;
        }
        @Override
        public String toString() {
            return "Car (id=" + id + ", manufacturerId=" + manufacturerId + ", model=" + model + ", year=" + year
                    + ", rating=" + rating;
        }
    }
    @Test
    public void example20_realLifeExampleWithCarRatings() {
        long start = System.currentTimeMillis();
        CompletionStage<List<Car>> carListCompletionStage = cars();
        carListCompletionStage.thenCompose(cars -> {
            //assertTrue("Cars is a list of cars", cars instanceof List);
            List<CompletionStage<Car>> updatedCars = cars.stream()
                    .map(car -> rating(car.manufacturerId).thenApply(r -> {
                        car.setRating(r);
                        return car;
                    })).collect(Collectors.toList());
            CompletableFuture<Void> done = CompletableFuture
                    .allOf(updatedCars.toArray(new CompletableFuture[updatedCars.size()]));
            return done.thenApply(v -> updatedCars.stream().map(CompletionStage::toCompletableFuture)
                    .map(CompletableFuture::join).collect(Collectors.toList()));
        }).whenComplete((cars, error) -> {
            if (error == null) {
                cars.forEach(System.out::println);
            } else {
                throw new RuntimeException(error);
            }
        }).toCompletableFuture().join();

        long end = System.currentTimeMillis();

        System.out.println("Took " + (end - start) + " ms.");
    }

    static CompletionStage<Float> rating(int manufacturer) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                simulateDelay();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            switch (manufacturer) {
                case 2:
                    return 4f;
                case 3:
                    return 4.1f;
                case 7:
                    return 4.2f;
                default:
                    return 5f;
            }
        }).exceptionally(th -> -1f);
    }
    static CompletionStage<List<Car>> cars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, 3, "Fiesta", 2017));
        carList.add(new Car(2, 7, "Camry", 2014));
        carList.add(new Car(3, 2, "M2", 2008));
        return CompletableFuture.supplyAsync(() -> carList);
    }
    private static void simulateDelay() throws InterruptedException {
        Thread.sleep(5000);
    }
}