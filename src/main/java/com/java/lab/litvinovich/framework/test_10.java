package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Scanner;

public class test_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        // Читаем строки от пользователя, пока не введена пустая строка
        while (true) {
            System.out.print("Введите слово (пустая строка для завершения ввода): ");
            String word = sc.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }

        // Считываем букву для поиска
        System.out.print("Введите букву для поиска: ");
        String letter = sc.nextLine().toLowerCase();

        // Считаем количество слов, начинающихся с заданной буквы
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith(letter)) {
                count++;
            }
        }

        // Выводим результат
        System.out.println("Количество слов, начинающихся с буквы " + letter + ": " + count);
    }
}

