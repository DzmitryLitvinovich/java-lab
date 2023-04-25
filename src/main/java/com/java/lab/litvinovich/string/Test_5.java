package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine().toLowerCase();

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }

        System.out.println("Количество гласных букв: " + vowelsCount);
        System.out.println("Количество согласных букв: " + consonantsCount);
    }
}
