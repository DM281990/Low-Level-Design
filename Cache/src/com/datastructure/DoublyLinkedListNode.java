package com.datastructure;

public class DoublyLinkedListNode<Key> {
    DoublyLinkedListNode<Key> next;
    int frequency = 0;
    DoublyLinkedListNode<Key> prev;
    Key element;

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public DoublyLinkedListNode(DoublyLinkedListNode<Key> next, DoublyLinkedListNode<Key> prev, Key element) {
        this.next = next;
        this.prev = prev;
        this.element = element;
    }

    public DoublyLinkedListNode(DoublyLinkedListNode<Key> next, DoublyLinkedListNode<Key> prev, Key element, int frequency) {
        this.next = next;
        this.prev = prev;
        this.element = element;
        this.frequency = frequency;
    }


    public DoublyLinkedListNode<Key> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode<Key> prev) {
        this.prev = prev;
    }

    public DoublyLinkedListNode<Key> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode<Key> next) {
        this.next = next;
    }

    public Key getElement() {
        return element;
    }

    public void setElement(Key element) {
        this.element = element;
    }

}
