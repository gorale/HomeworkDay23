package com.company;

import java.util.Iterator;

public interface List extends Iterable<Integer>{

    @Override
    Iterator<Integer> iterator();

    int size();

    boolean isEmpty();

    int get(int val);


    void add(int val);

    void add(int index, int val);

    void delete(int val);

}
