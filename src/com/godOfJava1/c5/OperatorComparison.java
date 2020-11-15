package com.godOfJava1.c5;

public class OperatorComparison {
    public static void main (String[] args) {
        OperatorComparison operatorComparison = new OperatorComparison();
        operatorComparison.comparison();
        operatorComparison.comparison2();
        operatorComparison.comparisonBoolean();
        operatorComparison.relational();
        operatorComparison.condition();
    }

    public void comparison() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);

        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }

    public void comparison2() {
        char charValue = 'a';
        System.out.println(97 == charValue);
        int intVaule = 1;
        double doubleValue = 1.0;
        System.out.println(intVaule == doubleValue);
    }

    public void comparisonBoolean() {
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue == isFalse);
        System.out.println(isTrue == isTrue);
        System.out.println(isFalse == isFalse);
    }

    public void relational() {
        int intValue1 = 1;
        int intValue2 = 2;
        System.out.println(intValue1 > intValue2);
        System.out.println(intValue1 < intValue2);
        System.out.println(intValue1 >= intValue2);
        System.out.println(intValue1 <= intValue2);
    }

    public void condition() {
        boolean x = true;
        boolean y = true;
        System.out.println(x && y);//true
        System.out.println(x || y);//true
        System.out.println("-----");
        x=false;
        System.out.println(x && y);//false
        System.out.println(x || y);//true
        System.out.println("-----");
        y=false;
        System.out.println(x && y);//false
        System.out.println(x || y);//false
    }
}
