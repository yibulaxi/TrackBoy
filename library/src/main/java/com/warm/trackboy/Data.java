package com.warm.trackboy;

import androidx.collection.LruCache;

public class Data {

    private static LruCache<String, Trace> sLruCache = new LruCache<>(200);

    public static void putEvent(String view, String eventId, String value) {
        putEvent(view, new Trace(eventId, value));
    }

    public static void putEvent(String view, Trace event) {
        sLruCache.put(view, event);
    }

    public static Trace getEvent(String view) {
        return sLruCache.get(view);
    }
}