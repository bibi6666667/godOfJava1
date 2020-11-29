package com.godOfJava1.c10inheritance;

public class ChildArg extends ParentArg{
    public ChildArg() {
        super("ChildArg"); // 부모 클래스의 String을 매개변수로 받는 생성자 호출
        System.out.println("Child Constructor");
    }
}
