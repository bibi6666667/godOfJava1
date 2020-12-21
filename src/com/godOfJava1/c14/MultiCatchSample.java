package com.godOfJava1.c14;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        sample.multiCatch();
    }

    private void multiCatch() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]); // NullPointerException 발생 후 ArrayIndexOutOfBoundsException 발생.
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception e) { // Exception은 모든 예외의 부모 클래스이다. (java.lang.Exception)
            System.out.println(intArray.length);
        }
    }
}
