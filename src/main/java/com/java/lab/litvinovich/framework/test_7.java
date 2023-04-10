package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class test_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        // Читаем строки от пользователя, пока не введена пустая строка
        while (true) {
            System.out.print("Введите строку (пустая строка для завершения ввода): ");
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            strings.add(line);
        }

        // Помещаем строки в стек в порядке ввода
        for (String string : strings) {
            stack.push(string);
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
