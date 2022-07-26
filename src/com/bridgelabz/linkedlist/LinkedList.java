package com.bridgelabz.linkedlist;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T key) {
        Node<T> newNode = new Node<>(key);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public T popFirst(int num) {
        T deleteData = head.data;
        head = head.next;
        return deleteData;
    }

    public T popLast(int num) {
        if (head == null || head.next == null){
            return null;
        }
        // Find second last node and store in temp variable
        Node<T> temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        // change second last node next pointer to null
        temp.next = null;
        return (T) head;
    }

    public Node<T> searchItem(T searchData) {
        Node<T> temp = head;
        while (temp != null){
            if (temp.data.equals(searchData))
                return temp;
                temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> searchNode = new Node<>(searchData);
        Node<T> newNode = new Node<>(insertData);
        if (searchNode != null){
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            return true;
        }
        return false;
    }
    public void insert(T searchData, T newData){
        Node<T> prevNode = new Node<>(searchData);
        if (prevNode == null){
            System.out.println("The given previous node can't be null !!!");
        }
        Node<T> newNode = new Node<>(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
}

