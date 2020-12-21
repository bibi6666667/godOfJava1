package com.godOfJava1.c14;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
    }

    // try 블록 내에서 선언한 변수는 catch 블록에서 사용할 수 없다.
    private void checkVariable() {
        int[] intArray = null; // 따라서 일반적으로 catch문장에서 사용할 변수에 대해서는 이처럼 try앞에 미리 선언해 놓는다.
        try {
            intArray = new int[5]; // 예외 발생 전까지는 try블록 내의 코드도 정상적으로 실행된다.
            System.out.println(intArray[5]); // 예외 발생하는 부분.
        } catch (Exception e) {
            System.out.println(intArray.length); // 5
        }
        System.out.println("This code must run.");
    }
}
