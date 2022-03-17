package com.company;

import java.util.Iterator;

public class LinkedList implements List {


    private static Node head;
    private static int size = 0;

    private class LinkedListIterator implements Iterator<Integer>{
        private int index;

        private Node node = head;

        @Override
        public boolean hasNext() {
            return index < size();
        }
        @Override
        public Integer next() {
            Integer temp;
            index++;
            temp = node.val;
            node = node.next;
            return temp;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }




    @Override
    public int size() {

        if (head == null) {
            return 0;
        }
        Node temp = head;
        int i = 1;
        while (temp.next != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {

        return head == null;
    }

    @Override
    public int get(int val) {
        if (head == null) {

            return -1;
        }
        if (head.val == val) {
            System.out.println("Yes elem");
            return 1;
        }
        Node temp = head;
        int i = 0;
        while (temp.next != null) {
            ++i;
            if (temp.next.val == val) {
                return i;
            }
            temp = temp.next;
        }
        return -1;

    }

    @Override
    public void add(int val) {
        if (head == null) {

            head = new Node(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);

    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(val);
        Node temp = head;
        int counter = 0;
        while (counter < index-1){
            temp = temp.next;
            counter++;
        }
        temp.next = newNode;
    }

    @Override
    public void delete(int val) {

        if (head == null) {
            return;
        }
        if (head.val == val) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        Node node = head;
        for (int i = 0; i < size(); i++) {
            list.append(node.val);
            list.append(" ");
            node = node.next;
        }
        return String.valueOf(list);
    }

    private static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;

        }
    }



}
