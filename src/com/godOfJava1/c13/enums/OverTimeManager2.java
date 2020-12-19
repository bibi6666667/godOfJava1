package com.godOfJava1.c13.enums;

public class OverTimeManager2 {
    public static void main(String[] args) {
        // switch문 없이 OverTimeValue2에서 enum에 상수 값을 지정해 사용도 가능하다.
        OverTimeValues2 value2= OverTimeValues2.FIVE_HOUR;
        System.out.println(value2);
        System.out.println(value2.getAmount());

        // enum클래스에서도 Object클래스의 메소드들을 사용할 수 있다. (enum의 부모 클래스가 Object이기 때문)
        // compareTo(Enum e) : 매개변수인 enum과 다른 상수의 선언순서를 비교해 리턴한다. 같으면 0, 매개변수보다 앞에 있으면 음수, 뒤에 있으면 양수를 리턴.
        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;
        System.out.println(value2.compareTo(value3));
    }
}
