package com.java.core.logic;

import java.util.Scanner;

public class ConstructionSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money value, please: ");

        int money = scanner.nextInt();

        switch (money) {
            case 0: {
                System.out.println("It's not enough!");
                break;
            }
            case 10: {
                System.out.println("Push yourself a bit more!");
                break;
            }
            case 20: {
                System.out.println("Come in!");
                break;
            }
            default: {
                System.out.println("There is no option for that value!");
                break;
            }
        }

        scanner.close();
    }
}
