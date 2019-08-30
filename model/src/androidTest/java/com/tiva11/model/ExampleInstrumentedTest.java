package com.tiva11.model;

import android.content.Context;
import android.util.Log;

//import androidx.test.InstrumentationRegistry;
import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.runner.AndroidJUnit4;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import static android.content.Context.MODE_PRIVATE;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private static final String TAG = "ExampleInstrumentedTest";
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();

        assertEquals("com.tiva11.model.test", appContext.getPackageName());
    }
    private static String HELLO_FILE_NAME = "hello.txt";
    private static String HELLO_TEXT = "Hello";
    @Test
    public void saveHelloFile() {
        FileOutputStream fos = null;
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();
        try {
            fos = appContext.openFileOutput(HELLO_FILE_NAME, MODE_PRIVATE);
            fos.write(HELLO_TEXT.getBytes());
            Log.i(TAG, "saveHelloFile: " + "Saved to " + appContext.getFilesDir() + "/" + HELLO_FILE_NAME);
            assertTrue(true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void loadHelloFile() {
        FileInputStream fis = null;
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();
        try {
            fis = appContext.openFileInput(HELLO_FILE_NAME);
            String text = new BufferedReader(new InputStreamReader(fis)).lines().collect(Collectors.joining());
            Log.i(TAG, "loadHelloFile: " + text.toString());
            assertEquals(HELLO_TEXT,text.toString().trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void getListOfFiles(){
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();
        File[] fileList = appContext.getFilesDir().listFiles();
        assertTrue(fileList.length > 0);
        for (File f : fileList) {
            Log.i(TAG, "getListOfFiles: " + f.getName());
        }
    }
}
