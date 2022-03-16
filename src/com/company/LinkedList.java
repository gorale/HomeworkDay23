package com.company;

public class LinkedList implements List {

    private static Node head;
    private int size = 0;

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        System.out.println("get " + linkedList.get(6));
        linkedList.add(0, 2);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList.toString());
        linkedList.add(3,55);



        System.out.println(linkedList.toString());
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());

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
            System.out.println("Index out of bounds");
            return;
        }
        if (index == size()) {
            add(val);
            return;
        }
        if (index == 0) {
            head = new Node(val);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(val);
        }


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

    public String toString() {
        for (Node x = head; x != null; x = x.next) {
            System.out.print(x.val + " ");
        }
        return "";
    }

    private static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;

        }


    }


}
