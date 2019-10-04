package com.java.core.primitives;

public class ShortInvestigation {

    public static void main(String[] args) {

        general();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of short - " + Short.BYTES);
        System.out.println("Bits of short - " + Short.SIZE);
        System.out.println();
    }

    private static void cast() {
        short maxShort = Short.MAX_VALUE;
        char shortToChar = (char) maxShort;
        byte shortToByte = (byte) maxShort;
        int  shortToInt = maxShort;
        long shortToLong = maxShort;
        float shortToFloat = maxShort;
        double shortToDouble = maxShort;

        System.out.println("short to char - " + shortToChar);
        System.out.println("short to byte - " + shortToByte);
        System.out.println("short to int - " + shortToInt);
        System.out.println("short to long - " + shortToLong);
        System.out.println("short to float - " + shortToFloat);
        System.out.println("short to double - " + shortToDouble);
        System.out.println();
    }
}
