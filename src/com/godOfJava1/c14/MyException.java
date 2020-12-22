package com.godOfJava1.c14;

public class MyException extends Exception{
    // 개발자가 예외를 직접 추가해 만들 수 있다.
    // 조건 : Throwable이나 그 자식 클래스(Exception)의 상속을 받아야 한다.
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
