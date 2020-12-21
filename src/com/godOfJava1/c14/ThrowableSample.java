package com.godOfJava1.c14;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    private void throwable() {
        int[] intArray = new int[5];
        try {
            // intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) { // Exception과 Error의 공통 부모 클래스 중 하나인 java.lang.Throwable.
            // Exception과 Error를 같은 메소드로 처리할 수 있게 함
            System.out.println(t.getMessage()); // 예외 메시지를 String형태로 제공
            System.out.println(t.toString()); // 예외 메시지를 String형태로 클래스 이름과 함께 제공
            t.printStackTrace(); // 첫 줄에는 예외 메시지를, 이후에는 예외가 발생하게 된 메소드들의 호출관계(stack trace)를 출력
        }
    }
}
