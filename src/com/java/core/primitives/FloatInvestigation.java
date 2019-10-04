package com.java.core.primitives;

public class FloatInvestigation {

    public static void main(String[] args) {

        general();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of float - " + Float.BYTES);
        System.out.println("Bits of float - " + Float.SIZE);
        System.out.println();
    }

    private static void cast() {
        float maxFloat = Float.MAX_VALUE;
        char floatToChar = (char) maxFloat;
        byte floatToByte = (byte) maxFloat;
        short floatToShort = (short) maxFloat;
        int floatToInt = (int) maxFloat;
        long floatToLong = (long) maxFloat;
        double floatToDouble = maxFloat;

        System.out.println("float to char - " + floatToChar);
        System.out.println("float to byte - " + floatToByte);
        System.out.println("float to short - " + floatToShort);
        System.out.println("float to int - " + floatToInt);
        System.out.println("float to long - " + floatToLong);
        System.out.println("float to double - " + floatToDouble);
        System.out.println();
    }
}
