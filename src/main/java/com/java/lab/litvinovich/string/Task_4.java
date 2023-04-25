package com.java.lab.litvinovich.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        // Разбить строку на слова, используя пробел в качестве разделителя
        String[] words = str.split("\\s+");

        // Изменить порядок слов на обратный
        Collections.reverse(Arrays.asList(words));

        // Объединить слова обратно в строку
        String reversed = String.join(" ", words);

        // Вывести полученную строку
        System.out.println("Результат: " + reversed);
    }
}
