package com.homework;

public interface List<E> {
    // Можно написать 5 методов
    void add(E element);

    void clear();

    void set(int index, E element);


    void get(int index);

    int size();

    boolean isEmpty();

}
