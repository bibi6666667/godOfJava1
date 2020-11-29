package com.godOfJava1.c10inheritance;

public class ChildPrint extends Parent { // 부모 클래스 상속
    public ChildPrint() {
        System.out.println("ChildPrint Constructor");
    }

    public void printAge() { // 확장한 클래스는 추가적 메소드를 만들어도 전혀 문제가 없다.
        System.out.println("printAge() - 18 month");
    }
}
