package org.example;

/*Написать на Java метод, проверяющий является ли строка палиндромом.*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Муха! О, муха! Велика аки лев! Ах, ум! О ах, ум!"));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}