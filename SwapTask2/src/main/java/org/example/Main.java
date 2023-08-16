package org.example;

/*Есть 2 целочисленных переменных a и b, в которых хранятся определенные
значения. Нужно написать на Java метод, меняющий местами значения
переменных a и b, не используя 3й переменной.*/


public class Main {
    public static void main(String[] args) {
        int a = 54;
        int b = 79;
        swap(a, b);
    }

    public static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
    }
}