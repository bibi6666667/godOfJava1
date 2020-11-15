package com.godOfJava1.c5;

public class OperatorUnary {
    public static void main(String[] args) {
        OperatorUnary operatorUnary = new OperatorUnary();
        // operatorUnary.unary();
        // operatorUnary.increment();
        // operatorUnary.decrement();
        // operatorUnary.complement();

        byte b = 127;
        operatorUnary.printTildeResult(b);
        b = 1;
        operatorUnary.printTildeResult(b);
    }

    public void unary() {
        int intValue = -10;
        int result = +intValue;
        System.out.println(result);
        result = -intValue;
        System.out.println(result);
    }

    public void increment() {
        int intValue = 1;
        System.out.println(intValue++); // 이후 intValue는 2.
        System.out.println(intValue);
        System.out.println(++intValue); //
    }

    public void decrement() {
        int intValue = 1;
        System.out.println(intValue--);
        System.out.println(intValue);
        System.out.println(--intValue);
    }

    public void complement() {
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }

    public void printTildeResult(byte b) {
        System.out.println("Original Value = " + b);
        System.out.println("Tilde Value = " + ~b);
    }

}
