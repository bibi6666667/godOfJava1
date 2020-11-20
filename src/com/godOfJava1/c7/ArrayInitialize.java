package com.godOfJava1.c7;

public class ArrayInitialize {
    String[] month = { "January", "Febuary", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    public static void main (String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        System.out.println(array.getMonth(3));
    }

    public void otherInit() {
        int[] lottoNumbers = {5, 12, 23,
                                25, 38, 41, 2}; // 줄바꿈은 상관없음
    }

    public String getMonth(int monthInt) {
        return month[monthInt-1];
    }
}
