package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Строка в обратном порядке: " + reversed);

        if (str.equalsIgnoreCase(reversed.toString())) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}
