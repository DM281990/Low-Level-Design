package com.policies;

public interface EvictionPolicy<Key> {
    public void keyAccessed(Key key) throws Exception;

    public Key evictKey();
}
