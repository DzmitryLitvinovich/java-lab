package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class test_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

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

        // Выводим на экран только нечетные числа
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
