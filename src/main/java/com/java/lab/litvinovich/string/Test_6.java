package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for (String word : words) {
            if (word.startsWith("a") || word.startsWith("A")) {
                System.out.println(word.toUpperCase());
            }
        }
    }
}
