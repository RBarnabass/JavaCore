package com.java.core.primitives;

public class DoubleInvestigation {

    public static void main(String[] args) {

        general();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of double - " + Double.BYTES);
        System.out.println("Bits of double - " + Double.SIZE);
        System.out.println();
        System.out.println("NaN - " + Double.NaN);
        System.out.println("Negative infinity - " + Double.NEGATIVE_INFINITY);
        System.out.println("Positive infinity - " + Double.POSITIVE_INFINITY);
        System.out.println();
    }

    private static void cast() {
        double maxDouble = Double.MAX_VALUE;
        char doubleToChar = (char) maxDouble;
        byte doubleToByte = (byte) maxDouble;
        short doubleToShort = (short) maxDouble;
        int doubleToInt = (int) maxDouble;
        long doubleToLong = (long) maxDouble;
        float doubleToFloat = (float) maxDouble;

        System.out.println("double to char - " + doubleToChar);
        System.out.println("double to byte - " + doubleToByte);
        System.out.println("double to short - " + doubleToShort);
        System.out.println("double to int - " + doubleToInt);
        System.out.println("double to long - " + doubleToLong);
        System.out.println("double to float - " + doubleToFloat);
        System.out.println();
    }
}
