package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        boolean hasDuplicates = false;
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                hasDuplicates = true;
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("Строка содержит дубликаты символов");
        } else {
            System.out.println("Строка содержит только уникальные символы");
        }
    }
}
