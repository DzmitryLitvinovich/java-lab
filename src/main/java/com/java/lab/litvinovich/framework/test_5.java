package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        // Читаем строки от пользователя, пока не введена пустая строка
        while (true) {
            System.out.print("Введите строку (пустая строка для завершения ввода): ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            strings.add(line);
        }

        // Сортируем строки в алфавитном порядке
        Collections.sort(strings);

        // Выводим отсортированные строки на экран
        System.out.println("Отсортированные строки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
