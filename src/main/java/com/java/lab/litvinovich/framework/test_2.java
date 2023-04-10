package com.java.lab.litvinovich.framework;

import java.util.*;

public class test_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите набор целых чисел через пробел: ");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        List<Integer> list = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String number : numbers) {
            int value = Integer.parseInt(number);
            list.add(value);
        }

        for (Integer number : list) {
            int count = Collections.frequency(list, number);
            if (count == 1) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("Уникальные числа: " + uniqueNumbers);
    }
}
