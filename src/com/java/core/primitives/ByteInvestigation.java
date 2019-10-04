package com.java.core.primitives;

public class ByteInvestigation {

    public static void main(String[] args) {

        general();
        cast();
    }

    private static void general() {
        System.out.println("Bytes of byte - " + Byte.BYTES);
        System.out.println("Bits of byte - " + Byte.SIZE);
        System.out.println();
    }

    private static void cast() {
        byte maxByte = Byte.MAX_VALUE;
        char byteToChar = (char) maxByte;
        byte byteToByte = maxByte;
        short byteToShort = maxByte;
        long byteToLong = maxByte;
        float byteToFloat = maxByte;
        double byteToDouble = maxByte;

        System.out.println("byte to char - " + byteToChar);
        System.out.println("byte to byte - " + byteToByte);
        System.out.println("byte to short - " + byteToShort);
        System.out.println("byte to long - " + byteToLong);
        System.out.println("byte to float - " + byteToFloat);
        System.out.println("byte to double - " + byteToDouble);
        System.out.println();
    }

}
