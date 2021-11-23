package com.homework;

public interface List<E> {

    void add(E element);

    void clear();

    void remove(int index);

    void set(int index, E element);

    void get(int index);

    int size();

    boolean isEmpty();
}
