package com.godOfJava1.c13.enums;

public class OverTimeManager3 {
    public static void main(String[] args) {
        // enum의 특수한 메소드 : values()
        // enum 클래스에 선언되어 있는 모든 상수를 배열로 리턴한다.
        OverTimeValues2[] valueList = OverTimeValues2.values();
        for (OverTimeValues2 value : valueList) {
            System.out.println(value);
        }

    }
}
