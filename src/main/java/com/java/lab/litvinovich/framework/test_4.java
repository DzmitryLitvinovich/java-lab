package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Введите целое число (для завершения ввода введите любой символ): ");
            if (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            } else {
                break;
            }
            sc.nextLine();
        }

        if (numbers.isEmpty()) {
            System.out.println("Набор чисел пуст.");
        } else {
            int min = Collections.min(numbers);
            int max = Collections.max(numbers);
            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }
    }
}
