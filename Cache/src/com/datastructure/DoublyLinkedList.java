package com.datastructure;

public class DoublyLinkedList<Key> {
    DoublyLinkedListNode<Key> first;
    DoublyLinkedListNode<Key> last;

    public DoublyLinkedListNode<Key> getLast() {
        return last;
    }

    public void setLast(DoublyLinkedListNode<Key> last) {
        this.last = last;
    }

    public void setFirst(DoublyLinkedListNode<Key> first) {
        this.first = first;
    }

    public DoublyLinkedListNode<Key> getFirst() {
        return first;
    }

    public DoublyLinkedList(DoublyLinkedListNode<Key> first, DoublyLinkedListNode<Key> last) {
        this.first = first;
        this.last = last;
    }

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void detachNode(DoublyLinkedListNode<Key> node) {
        if(node==null){
            return;
        }
        if(node.equals(first)){
            first = first.next;
            if(first!=null){
                first.prev=null;
            }
        } else if (node.equals(last)) {
            last =last.prev;
            if(last.next !=null){
                last.next=null;
            }
        }else{
            node.prev.next = node.next;
            node.next.prev =node.prev;
        }
    }

    public void addNodeAtLast(DoublyLinkedListNode<Key> node) {
        if(first==null){
            first =node;
            last =node;
        }else{
            node.prev = last;
            last.next =node;
            last = last.next;
        }
    }

    public DoublyLinkedListNode<Key> addElementAtLast(Key key) throws Exception {
        if(key ==null){
            throw new Exception("Invalid element");
        }
        DoublyLinkedListNode<Key> newNode = new DoublyLinkedListNode<>(null,null,key);
        addNodeAtLast(newNode);
        return newNode;
    }


}
