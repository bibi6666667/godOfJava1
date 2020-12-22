package com.godOfJava1.c15;

import java.util.EmptyStackException;

public class StringSample { // String클래스의 생성자를 알아보자.
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convertUTF16();
    }

    public void convert() { // 한글을 byte로, byte를 한글로 변환해보기
        try {
            String korean = "한글"; // "한글"이라는 값을 갖는 String 객체인 korean 생성
            byte[] array1 = korean.getBytes(); // korean을 getBytes()를 통해 byte배열로 만듦
            for (byte byteData : array1) {
                System.out.print(byteData + " "); // byte배열의 값을 하나씩 출력해 봄
            }
            System.out.println();
            String korean2 = new String(array1); // byte배열을 가지고 String객체 생성. byte배열을 매개변수로 갖는 String()생성자 활용.
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array) { // 자주 사용되는 코드는 메소드로 뺴기
        for(byte data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public void convertUTF16() { // UTF-16 캐릭터셋으로 변환해보기. byte[] <-> 한글 로 전환할 때 동일한 캐릭터셋을 사용해야 함.
        try { // UTF-16은 한글 한 글자당 3바이트로 표현한다 - 다른 캐릭터셋은 다를 수 있음
            String korean = "자바의 신 최고 !!!";
            byte[] array1 = korean.getBytes("UTF-16"); // 한글을 UTF-16형식의 byte 배열로 변환
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16"); // byte[]를 UTF-16 캐릭터셋으로 지정해 문자열로 변환
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
