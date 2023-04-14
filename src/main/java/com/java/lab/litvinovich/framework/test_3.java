package com.java.lab.litvinovich.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputStrings = new ArrayList<>();

        while (true) {
            System.out.print("Введите строку (для завершения ввода введите пустую строку): ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputStrings.add(input);
        }

        System.out.print("Введите подстроку для поиска: ");
        String substring = sc.nextLine();

        List<String> matchingStrings = new ArrayList<>();
        for (String inputString : inputStrings) {
            if (inputString.contains(substring)) {
                matchingStrings.add(inputString);
            }
        }

        System.out.println("Введенные строки, содержащие подстроку \"" + substring + "\":");
        for (String matchingString : matchingStrings) {
            System.out.println(matchingString);
        }
    }
}
