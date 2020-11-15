package com.godOfJava1.c5;

public class Operators {
    public static void main (String[] args) {
        Operators operators = new Operators();
        /*
        operators.additiveSubtract();
        operators.multipleDivision();
        operators.divideInt();
        */
        operators.remainder();
    }

    public void additiveSubtract() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }

    public void multipleDivision() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 * intValue2;
        System.out.println(result);
        result = intValue2 / intValue1;
        System.out.println(result);
    }

    public void divideInt() {
        int intValue1 = 5;
        int intValue2 = 10;
        int intResult = intValue1 / intValue2;
        System.out.println("int 5 / 10 = " + intResult);
        double doubleValue1 = 5;
        double doubleValue2 = 10;
        double doubleResult = doubleValue1 / doubleValue2;
        System.out.println("double 5 / 10 = " + doubleResult);
    }

    public void remainder() {
        int intValue1 = 53;
        int intValue2 = 10;
        int result = intValue1 % intValue2;
        System.out.println(result);
    }
}
