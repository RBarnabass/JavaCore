package com.java.core.primitives;

public class BooleanInvestigation {

    private static final boolean tru = true;

    private static final boolean fal = false;

    public static void main(String[] args) {

        and();
        or();
        xor();
    }

    private static void and() {
        System.out.println("And for (true, true) - " + Boolean.logicalAnd(tru, tru));
        System.out.println("And for (true, false) - " + Boolean.logicalAnd(tru, fal));
        System.out.println("And for (false, true) - " + Boolean.logicalAnd(fal, tru));
        System.out.println("And for (false, false) - " + Boolean.logicalAnd(fal, fal));
        System.out.println();
    }

    private static void or() {
        System.out.println("Or for (true, true) - " + Boolean.logicalOr(tru, tru));
        System.out.println("Or for (true, false) - " + Boolean.logicalOr(tru, fal));
        System.out.println("Or for (false, true) - " + Boolean.logicalOr(fal, tru));
        System.out.println("Or for (false, false) - " + Boolean.logicalOr(fal, fal));
        System.out.println();
    }

    private static void xor() {
        System.out.println("Xor for (true, true) - " + Boolean.logicalXor(tru, tru));
        System.out.println("Xor for (true, false) - " + Boolean.logicalXor(tru, fal));
        System.out.println("Xor for (false, true) - " + Boolean.logicalXor(fal, tru));
        System.out.println("Xor for (false, false) - " + Boolean.logicalXor(fal, fal));
    }
}
