package com.java.core;

public class Home {

    public static void main(String[] args) {

        System.out.println("11 - " + Integer.toBinaryString(11));
        System.out.println("67 - " + Integer.toBinaryString(67));
        System.out.println("92 - " + Integer.toBinaryString(92));
        System.out.println("1267 - " + Integer.toBinaryString(1267));
        System.out.println("873 - " + Integer.toBinaryString(873));
        System.out.println("1034 - " + Integer.toBinaryString(1034));
        System.out.println("789 - " + Integer.toBinaryString(789));
        System.out.println();

        System.out.println("10011 - " + Integer.parseInt("10011", 2));
        System.out.println("1111001 - " + Integer.parseInt("1111001", 2));
        System.out.println("10110110 - " + Integer.parseInt("10110110", 2));
        System.out.println("111000 - " + Integer.parseInt("111000", 2));
        System.out.println("1001 - " + Integer.parseInt("1001", 2));
        System.out.println("11001101 - " + Integer.parseInt("11001101", 2));
        System.out.println();

        System.out.println("354 - " + Integer.toBinaryString(354));
        System.out.println("87 - " + Integer.toBinaryString(87));
        System.out.println("Add - " + Integer.toBinaryString(354 + 87));
        System.out.println("Minus - " + Integer.toBinaryString(354 - 87));
    }
}
