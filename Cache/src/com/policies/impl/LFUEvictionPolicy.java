package com.policies.impl;

import com.datastructure.DoublyLinkedList;
import com.datastructure.DoublyLinkedListNode;
import com.policies.EvictionPolicy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LFUEvictionPolicy<Key> implements EvictionPolicy<Key> {
    private TreeMap<Integer, DoublyLinkedList<Key>> frequency;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;

    public LFUEvictionPolicy(){
        this.mapper = new HashMap<>();
        frequency = new TreeMap<>();
    }
    @Override
    public void keyAccessed(Key key) throws Exception {
        if(mapper.containsKey(key)){
            DoublyLinkedList<Key> frequencyList = frequency.get(mapper.get(key).getFrequency());
            frequencyList.detachNode(mapper.get(key));
            // Increase frequency;
            mapper.get(key).setFrequency(mapper.get(key).getFrequency()+1);
        }else{
            DoublyLinkedListNode<Key> newNode = new DoublyLinkedListNode<>(null,null,key);
            newNode.setFrequency(1);
            newNode.setElement(key);
            mapper.put(key,newNode);
        }
        // Add values in frequency Map
        if(!frequency.containsKey(mapper.get(key).getFrequency())){
            frequency.put(mapper.get(key).getFrequency(),new DoublyLinkedList<>());
        }
        frequency.get(mapper.get(key).getFrequency()).addNodeAtLast(mapper.get(key));
    }

    @Override
    public Key evictKey() {
        DoublyLinkedList<Key> dll  = frequency.get(frequency.lastKey());
        DoublyLinkedListNode<Key> first = dll.getFirst();
        if(first==null){
            return null;
        }
        dll.detachNode(first);
        if(dll.getLast()==dll.getFirst() && dll.getLast()==null){
            frequency.remove(frequency.lastKey());
        }
        mapper.remove(first.getElement());
        return first.getElement();
    }
}
