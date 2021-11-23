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
        System.out.println("Перевірка  MyArraylist <String>, методом \"isEmpty()\": " + string.isEmpty() + "\n");

        System.out.println("Розмір MyArraylist <Integer>, метод \"size()\": " + integer.size());
        System.out.print("Метод \"integer.get(1)\": ");
        integer.get(1);
        System.out.print("Метод \"integer.set(1, 555)\"");
        integer.set(1, 555);
        System.out.print("\nМетод \"integer.get(1)\": ");
        integer.get(1);
        System.out.println("\nMyArraylist <Integer> до метода \"remove(2)\":\n" + integer);
        integer.remove(2);
        System.out.println("\nMyArraylist <Integer> після методу \"remove(2)\":\n" + integer);

        System.out.println("Перевірка методів, на некоректний індекс:\n");
        System.out.println("integer.get(-1):");
        integer.get(-1);
        System.out.println("\ninteger.set(55, 3):");
        integer.set(55, 3);
        System.out.println("\ninteger.remove(22);");
        integer.remove(22);
    }
}
