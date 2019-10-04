package com.java.core.primitives;

public class LongInvestigation {

    private static long one = 1;
    private static long two = 2;
    private static long three = 3;
    private static long four = 4;
    private static long five = 5;
    private static long ten = 10;
    private static long hundred = 100;
    private static long minLong = Long.MIN_VALUE;
    private static long maxLong = Long.MAX_VALUE;

    public static void main(String[] args) {

        general();
        bitsToString();
        bitCount();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of long - " + Long.BYTES);
        System.out.println("Bits of long - " + Long.SIZE);
        System.out.println();
    }

    private static void bitsToString() {
        System.out.println("Min to binary string - " + Long.toBinaryString(minLong));
        System.out.println("Max to binary string - " + Long.toBinaryString(maxLong));
        System.out.println();
        System.out.println("One to binary string - " + Long.toBinaryString(one));
        System.out.println("Two to binary string - " + Long.toBinaryString(two));
        System.out.println("Three to binary string - " + Long.toBinaryString(three));
        System.out.println("Four to binary string - " + Long.toBinaryString(four));
        System.out.println("Five to binary string - " + Long.toBinaryString(five));
        System.out.println("Ten to binary string - " + Long.toBinaryString(ten));
        System.out.println("Hundred to binary string - " + Long.toBinaryString(hundred));
        System.out.println();
    }

    private static void bitCount() {
        System.out.println("Min bit count - " + Long.bitCount(minLong));
        System.out.println("Max bit count - " + Long.bitCount(maxLong));
        System.out.println();
        System.out.println("One bit count - " + Long.bitCount(one));
        System.out.println("Two bit count - " + Long.bitCount(two));
        System.out.println("Three bit count - " + Long.bitCount(three));
        System.out.println("Four bit count - " + Long.bitCount(four));
        System.out.println("Five bit count - " + Long.bitCount(five));
        System.out.println("Ten bit count - " + Long.bitCount(ten));
        System.out.println("Hundred bit count - " + Long.bitCount(hundred));
        System.out.println();
    }

    private static void cast() {
        char longToChar = (char) maxLong;
        byte longToByte = (byte) maxLong;
        short longToShort = (short) maxLong;
        int longToInt = (int) maxLong;
        float longToFloat = maxLong;
        double longToDouble = maxLong;

        System.out.println("long to char - " + longToChar);
        System.out.println("long to byte - " + longToByte);
        System.out.println("long to short - " + longToShort);
        System.out.println("long to int - " + longToInt);
        System.out.println("long to float - " + longToFloat);
        System.out.println("long to double - " + longToDouble);
        System.out.println();
    }
}
