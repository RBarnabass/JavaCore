package com.java.core.addition;

import java.util.Scanner;

public class ClassScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value, please: ");

        if (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        } else {
            System.out.println("No integer!");
        }

        scanner.close();
    }
}
