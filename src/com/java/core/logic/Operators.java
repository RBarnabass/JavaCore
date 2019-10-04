package com.java.core.logic;

public class Operators {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("Post-increment");
        System.out.println(number++);
        System.out.println(number);

        number = 5;
        System.out.println();
        System.out.println("Pre-increment");
        System.out.println(++number);
        System.out.println(number);

        number = 5;
        System.out.println();
        System.out.println("Post-decrement");
        System.out.println(number--);
        System.out.println(number);

        number = 5;
        System.out.println();
        System.out.println("Pre-decrement");
        System.out.println(--number);
        System.out.println(number);

        System.out.println();

        boolean isTrue = true;
        System.out.println("!true - " + !isTrue);

        boolean isFalse = false;
        System.out.println("!false - " + !isFalse);
    }

}
