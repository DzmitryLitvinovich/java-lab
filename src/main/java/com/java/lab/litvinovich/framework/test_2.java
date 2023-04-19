package com.java.lab.litvinovich.framework;

import java.util.*;

public class test_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите набор целых чисел через пробел: ");
        String input = sc.nextLine();

        HashSet<Integer> set = new HashSet<>();
        for (String number : input.split("\\s+")) {
            int value = Integer.parseInt(number);
            set.add(value);
        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : set) {
            int count = Collections.frequency(new ArrayList<>(set), number);
            if (count == 1) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("Уникальные числа: " + uniqueNumbers);
    }
}
