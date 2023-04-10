package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        // Считываем строки от пользователя
        while (true) {
            System.out.print("Введите строку: ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        // Сортируем строки по длине
        strings.sort(Comparator.comparingInt(String::length));

        // Выводим отсортированный список строк
        System.out.println("Введенные строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
