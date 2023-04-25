package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = sc.nextLine();

        char[] charArray = inputString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }

        System.out.println("Результат: " + stringBuilder.toString());
    }
}
