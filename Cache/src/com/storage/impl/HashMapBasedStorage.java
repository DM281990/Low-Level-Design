package com.storage.impl;

import com.storage.Storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key,Value> implements Storage<Key,Value> {
    Map<Key,Value> mp = new HashMap<>();

    @Override
    public void add(Key key, Value value) {
        mp.put(key,value);
    }

    @Override
    public void remove(Key key) {
        mp.remove(key);
    }

    @Override
    public Value get(Key key) {
        return mp.get(key);
    }
}
