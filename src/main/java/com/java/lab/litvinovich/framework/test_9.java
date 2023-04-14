package com.java.lab.litvinovich.framework;

import java.util.*;

public class test_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // Считываем строки от пользователя, пока не будет введена пустая строка
        while (true) {
            System.out.print("Введите строку (пустая строка для завершения ввода): ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }

        // Создаем HashMap для хранения количества вхождений каждого слова
        Map<String, Integer> wordCounts = new HashMap<>();

        // Проходим циклом по каждой строке и каждому слову в строке
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (wordCounts.containsKey(word)) {
                    // Если слово уже есть в HashMap, увеличиваем его значение на 1
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                } else {
                    // Если слова нет в HashMap, добавляем его со значением 1
                    wordCounts.put(word, 1);
                }
            }
        }

        // Находим слово с максимальным значением в HashMap
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        // Выводим наиболее часто встречающееся слово на экран
        System.out.println("Наиболее часто встречающееся слово: " + mostFrequentWord);
    }
}
