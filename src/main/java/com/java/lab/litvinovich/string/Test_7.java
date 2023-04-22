package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.length() > 5) {
                count++;
            }
        }

        System.out.println("Количество слов, содержащих более 5 символов: " + count);
    }
}
