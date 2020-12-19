package com.godOfJava1.c13.enums;

// enum 상수 값을 지정하는 것은 가능하나, 값을 동적으로 할당하는 것(바꾸는 것)은 불가능하다.
public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;
    OverTimeValues2(int amount) { // 생성자
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
