package com.godOfJava1.c8;

public class ReferenceString {
    // 다음과 같은 순서로 선언하는 것이 좋다.
    //////////// ⬇ 인스턴스 변수
    String instanceVariable;

    //////////// ⬇  생성자 영역
    public ReferenceString() {} // 매개변수 없는 생성자
    public ReferenceString(String arg){} // 문자열을 매개변수로 받는 생성자.

    //////////// ⬇ 메소드 영역
    public static void main(String[] args) {
        ReferenceString reference = new ReferenceString();// -> 매개변수 없는 생성자와 연결된다.
    }

    public String getString() {
        return instanceVariable;
    }

    public void setString(String str) {
        instanceVariable = str;
    }
}
