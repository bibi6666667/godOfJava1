package com.godOfJava1.c5;

public class OperatorCasting {
    public static void main(String[] args) {
        OperatorCasting operator = new OperatorCasting();
        operator.casting();
        operator.casting2();
    }

    public void casting() {
        byte byteValue = 127;
        short shortValue = byteValue;
        // 작은 타입(byte)에서 큰 타입(short)으로 변활할 떄는 별도의 작업 필요없음.

        shortValue++; // 128. ->byte는 최댓값을 초과함 / short는 초과하지 않음.
        System.out.println(shortValue);
        byteValue = (byte)shortValue; // byteValue에 byte최댓값 이상의 값인 shortValue(128)을 할당.
        // 큰 타입(short)에서 작은 타입(byte)으로 변환할 때는 소괄호 안에 범위가 작은 타입을 명시해 주어야.

        System.out.println(byteValue); // -128.
    }
    public void casting2(){
        short shortValue = 256;
        byte byteValue = (byte)shortValue; // short(256)를 byte로 형변환
        System.out.println(byteValue);
        shortValue = 255;
        byteValue = (byte)shortValue; // short(255)를 byte로 형변환
        System.out.println(byteValue);
    }
}
