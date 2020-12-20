package com.godOfJava1.c14;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

    // 예외를 처리하는 try-catch문.
    public void arrayOutOfBoundsTryCatch() {
        int[] intArray = new int[5]; //
        try { // 예외가 발생하는 부분만 try 이후 중괄호로 묶어준다.
            System.out.println(intArray[5]);
            System.out.println("This code should run.");
        } catch (Exception e) { //
            // 예외가 발생했을 때 처리할 사항을 catch 이후 중괄호로 묶어준다.
            System.err.println("Exception occurred."); // sout와 다르게 빨간색으로 표시된다. 오류 발생부분에는 err을 사용해 출력하자.
        }
        System.out.println("This code must run.");
    }
}
