package com.example.au_demo_live;

public class LinkedList<T> {
    Node<T> headNode;

    public T getElement(int index){
        if(index <0){
            throw  new RuntimeException("Index can not be negative");
        }
        var iteratorNode = headNode;

        var currIndex = 0;
        while(iteratorNode != null){
            if(currIndex == index){
                return iteratorNode.getValue();
            }

            iteratorNode = iteratorNode.getNextNode();
            currIndex++;
        }

        throw new RuntimeException("Index greater than the size of the list");
    }

    public void addElement(T element){
        if(element==null) throw new RuntimeException("Entered Element is null");

        final var tempNode = new Node<T>();
        tempNode.setValue(element);

        if(headNode == null){
            headNode = tempNode;
        }

        var iteratorNode = headNode;
        while(iteratorNode.getNextNode() != null){
            iteratorNode = iteratorNode.getNextNode();
        }
    }

    public void addElementAt(T element, Integer position){
        var iteratorNode = headNode;
        if(iteratorNode==null) throw new RuntimeException("Linked list is empty!!!");
        try{
            final var tempNode = new Node<T>();
            tempNode.setValue(element);

            for(Integer i =0;i<position;i++){

            }

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }
}

class Node<T> {
    private T value;
    private Node<T> nextNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
