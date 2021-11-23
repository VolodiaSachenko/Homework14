package com.homework;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 22.11.21
 */

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> string = new MyArrayList<>();
        MyArrayList<Integer> integer = new MyArrayList<>();
        string.add("Java");
        string.add("Hillel");
        integer.add(7);
        integer.add(8);
        integer.add(95);
        integer.add(5);

        System.out.println("Створення MyArraylist <String>: \n" + string + "\n");
        System.out.println("Створення MyArraylist <Integer>: \n" + integer + "\n");

        string.clear();
        System.out.println("Видалено MyArraylist <String>, методом \"clear()\".");
        System.out.println("Перевірка  MyArraylist <String>, методом \"isEmpty()\": " + string.isEmpty());
        System.out.println("Розмір MyArraylist <Integer>: " + integer.size());
        System.out.print("Метод \"integer.get(1)\": ");
        integer.get(1);
        System.out.print("Метод \"integer.set(1, 555)\"");
        integer.set(1, 555);
        System.out.print("\nМетод \"integer.get(1)\": ");
        integer.get(1);
    }
}
