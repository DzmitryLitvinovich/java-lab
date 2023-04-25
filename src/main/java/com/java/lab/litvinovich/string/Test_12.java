package com.java.lab.litvinovich.string;

import java.util.Arrays;

public class Test_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        // Приводим строки к нижнему регистру
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Убираем пробелы из строк
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // Преобразуем строки в массивы символов и сортируем их
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);

        // Сравниваем отсортированные массивы символов
        boolean isAnagram = Arrays.equals(charArray1, charArray2);

        // Выводим результат
        if (isAnagram) {
            System.out.println("Строки являются анаграммами друг друга.");
        } else {
            System.out.println("Строки не являются анаграммами друг друга.");
        }
    }
}
