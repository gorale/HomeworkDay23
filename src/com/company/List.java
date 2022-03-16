package com.company;

public interface List {
    int size();

    boolean isEmpty();

    int get(int val);


    void add(int val);

    void add(int index, int val);

    void delete(int val);

}
