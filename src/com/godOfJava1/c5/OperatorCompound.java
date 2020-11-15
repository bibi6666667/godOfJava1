package com.godOfJava1.c5;

public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound compoundOperator = new OperatorCompound();
        compoundOperator.compound();
    }

    public void compound() {
        int intValue = 10;
        intValue += 5;
        System.out.println(intValue);
        intValue -= 5;
        System.out.println(intValue);
        intValue *= 5;
        System.out.println(intValue);
        intValue /= 5;
        System.out.println(intValue);
        intValue %= 5;
        System.out.println(intValue);

    }
}
