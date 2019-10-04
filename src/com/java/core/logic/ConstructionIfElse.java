package com.java.core.logic;

import java.util.Scanner;

public class ConstructionIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age please: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;

        if (age < 0) {
            System.out.println("Wrong input!");
        }


        if (isAdult) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry!");
        }


        if (age == 18) {
            System.out.println("Welcome!");
        } else if (age > 18) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Sorry!");
        }

        scanner.close();
    }
}
