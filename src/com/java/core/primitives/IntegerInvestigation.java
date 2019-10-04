package com.java.core.primitives;

public class IntegerInvestigation {

    private static int one = 1;
    private static int two = 2;
    private static int three = 3;
    private static int four = 4;
    private static int five = 5;
    private static int ten = 10;
    private static int hundred = 100;
    private static int minInt = Integer.MIN_VALUE;
    private static int maxInt = Integer.MAX_VALUE;

    public static void main(String[] args) {

        general();
        bitsToString();
        bitCount();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of int - " + Integer.BYTES);
        System.out.println("Bits of int - " + Integer.SIZE);
        System.out.println();
    }

    private static void bitsToString() {
        System.out.println("Min to binary string - " + Integer.toBinaryString(minInt));
        System.out.println("Max to binary string - " + Integer.toBinaryString(maxInt));
        System.out.println();
        System.out.println("One to binary string - " + Integer.toBinaryString(one));
        System.out.println("Two to binary string - " + Integer.toBinaryString(two));
        System.out.println("Three to binary string - " + Integer.toBinaryString(three));
        System.out.println("Four to binary string - " + Integer.toBinaryString(four));
        System.out.println("Five to binary string - " + Integer.toBinaryString(five));
        System.out.println("Ten to binary string - " + Integer.toBinaryString(ten));
        System.out.println("Hundred to binary string - " + Integer.toBinaryString(hundred));
        System.out.println();
    }

    private static void bitCount() {
        System.out.println("Min bit count - " + Integer.bitCount(minInt));
        System.out.println("Max bit count - " + Integer.bitCount(maxInt));
        System.out.println();
        System.out.println("One bit count - " + Integer.bitCount(one));
        System.out.println("Two bit count - " + Integer.bitCount(two));
        System.out.println("Three bit count - " + Integer.bitCount(three));
        System.out.println("Four bit count - " + Integer.bitCount(four));
        System.out.println("Five bit count - " + Integer.bitCount(five));
        System.out.println("Ten bit count - " + Integer.bitCount(ten));
        System.out.println("Hundred bit count - " + Integer.bitCount(hundred));
        System.out.println();
    }

    private static void cast() {
        char intToChar = (char) maxInt;
        byte intToByte = (byte) maxInt;
        short intToShort = (short) maxInt;
        long intToLong = maxInt;
        float intToFloat = maxInt;
        double intToDouble = maxInt;

        System.out.println("Int to char - " + intToChar);
        System.out.println("Int to byte - " + intToByte);
        System.out.println("Int to short - " + intToShort);
        System.out.println("Int to long - " + intToLong);
        System.out.println("Int to float - " + intToFloat);
        System.out.println("Int to double - " + intToDouble);
        System.out.println();
    }
}
