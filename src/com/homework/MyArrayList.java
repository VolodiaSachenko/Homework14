package com.homework;

import java.util.Arrays;

public class MyArrayList<E> implements List<E> {
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private Object[] elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    private int counter;


    @Override
    public String toString() {
        return "MyArrayList {" +
                "elementData = " + Arrays.toString(elementData) +
                '}';
    }

    @Override
    public void add(E element) {
        if (element == null) {
            return;
        }
        if (counter == elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length + 1);
        }
        this.elementData[counter] = element;
        counter++;
    }

    @Override
    public void clear() {
        this.elementData = new Object[0];
        this.counter = 0;
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < elementData.length) {
            Object[] newElementData = new Object[elementData.length - 1];
            int remainingElements = elementData.length - (index + 1);
            System.arraycopy(elementData, 0, newElementData, 0, index);
            System.arraycopy(elementData, index + 1, newElementData, index, remainingElements);
            this.elementData = newElementData;
            counter--;
        } else {
            System.out.println("Помилка, невірний індекс");
        }
    }

    @Override
    public void set(int index, E element) {
        if (index >= 0 && index < elementData.length) {
            this.elementData[index] = element;
        } else {
            System.out.println("Помилка, невірний індекс");
        }
    }

    @Override
    public void get(int index) {
        if (index >= 0 && index < elementData.length) {
            System.out.println(elementData[index]);
        } else {
            System.out.println("Помилка, невірний індекс");
        }
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public boolean isEmpty() {
        return elementData.length == 0;
    }
}
