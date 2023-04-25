package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String inputString = sc.nextLine();

        // приводим к нижнему регистру, удаляем пробелы и знаки препинания
        inputString = inputString.toLowerCase().replaceAll("[^a-zа-я0-9]", "");

        // создаем объект StringBuilder и записываем туда перевернутую строку
        StringBuilder reversedString = new StringBuilder(inputString).reverse();

        // сравниваем исходную и перевернутую строки
        if (inputString.equals(reversedString.toString())) {
            System.out.println("Введенная строка является палиндромом.");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }
    }
}
