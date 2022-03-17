package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
//        linkedList.add(3,10);

        System.out.println(linkedList.toString());
        System.out.println("get " + linkedList.get(6));
        System.out.println("size "+linkedList.size());
        System.out.println(linkedList.isEmpty());

        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }

    }
}
