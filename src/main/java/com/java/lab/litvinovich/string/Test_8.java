package com.java.lab.litvinovich.string;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        str = str.replaceAll(" ", "").trim();

        System.out.println("Строка без пробелов: " + str);
    }
}
