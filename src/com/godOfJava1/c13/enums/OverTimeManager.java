package com.godOfJava1.c13.enums;

// enum클래스 사용하기 : switch문 사용.
public class OverTimeManager {

    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        // 위 코드 1줄은 아래 코드 2줄과 같은 의미이다.
        // OverTimeValues value = OverTimeValues.THREE_HOUR;
        // int myAmount = manager.getOverTimeAmount(value);
        // 즉, enum타입은 enum클래스이름.상수이름 을 지정함으로써 클래스의 객체 생성이 완료된다.
        // 또 enum타입이라도 THREE_HOUR라는 문자열 값을 그대로 파라미터로 넘기면 안 되고, enum객체를 만들어 넘겨줘야 한다.
        System.out.println(myAmount);
    }

    public int getOverTimeAmount(OverTimeValues value) {
        //
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }
}
