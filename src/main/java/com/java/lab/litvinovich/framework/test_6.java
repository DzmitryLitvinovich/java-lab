package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Читаем числа от пользователя, пока не введена пустая строка
        while (true) {
            System.out.print("Введите число (пустая строка для завершения ввода): ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число. Попробуйте еще раз.");
            }
        }

        // Удаляем отрицательные числа из списка
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number < 0) {
                iterator.remove();
            }
        }

        // Выводим список положительных чисел на экран
        System.out.println("Положительные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
