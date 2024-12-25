package com.storage;

public interface Storage <Key,Value>{
    public void add(Key key, Value value);

    public void remove(Key ketToRemove);

    public Value get(Key key);
}
