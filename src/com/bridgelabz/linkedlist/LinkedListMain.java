package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    linkedList1.push(70);
    linkedList1.push(30);
    linkedList1.push(56);
    linkedList1.print();

    System.out.println();

    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList2.add(56);
    linkedList2.add(30);
    linkedList2.add(70);
    linkedList2.print();

    linkedList2.popFirst(56);
    System.out.println();
    linkedList2.print();

    System.out.println();

    LinkedList<Integer> linkedList3 = new LinkedList<>();
    linkedList3.add(56);
    linkedList3.add(30);
    linkedList3.add(70);
    linkedList3.print();
    System.out.println();

    linkedList3.popLast(70);
    linkedList3.print();

    System.out.println();

    if (linkedList3.searchItem(30) != null)
        System.out.println("Node Found!!");
    else
        System.out.println("Node not found!!");

    LinkedList<Integer> linkedList4 = new LinkedList<>();
    linkedList4.add(56);
    linkedList4.add(30);
    linkedList4.add(70);
    linkedList4.print();
    System.out.println();
    System.out.println(linkedList4.insertAfter(30,40));
    linkedList4.insert(30,40);
    linkedList4.print();
    }
}
