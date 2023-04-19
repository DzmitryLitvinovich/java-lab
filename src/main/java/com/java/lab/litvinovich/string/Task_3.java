package com.java.lab.litvinovich.string;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = sc.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = sc.nextLine();

        // Приводим строки к нижнему регистру и удаляем пробелы
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        if (str1.length() != str2.length()) {
            System.out.println("Строки не являются анаграммами");
            return;
        }

        // Создаем массивы символов для каждой строки
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        // Сортируем массивы символов
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // Сравниваем отсортированные массивы
        if (Arrays.equals(str1Array, str2Array)) {
            System.out.println("Строки являются анаграммами");
        } else {
            System.out.println("Строки не являются анаграммами");
        }
    }
}
