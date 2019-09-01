package com.tiva11.model;
import androidx.lifecycle.Observer;
public class Event<T> {
    private T content;
    private boolean _hasBeenConsumed = false;
    public boolean hasBeenConsumed(){return _hasBeenConsumed;}
    public Event(T content) {
        this.content = content;
    }
    public T consume() {
        if(hasBeenConsumed()) return null;
        else {
            _hasBeenConsumed = true;
        return content;
        }
     }
    public T peek(){return content;}

    public static class EventObserver<T> implements Observer<Event<? extends T>> {
        public interface EventUnhandledContent<T> {
            void onEventUnhandledContent(T t);
        }
        private EventUnhandledContent<T> content;
        public EventObserver(EventUnhandledContent<T> content) {
            this.content = content;
        }
        @Override
        public void onChanged(Event<? extends T> event) {
            if (event != null) {
                T result = event.consume();
                if (result != null && content != null) {
                    content.onEventUnhandledContent(result);
                }
            }
        }
    }
}
