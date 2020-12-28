package com.godOfJava1.c18;

public class VariableTypes {
    // 변수 Variable : 자바에서 변수의 종류는 4가지이다.
    static int classVariable; // 클래스 변수 class variables : 클래스가 생성될 떄 태어나고, 자바 프로그램이 끝날 때 소멸함.
    int instanceVariable; // 인스턴스 변수 instance variables : 객체가 생성될 때 태어나고, 객체를 참조하는 다른 객체가 없으면 소멸함.
    public void method(int parameter) { // 매개 변수 parameters : 메소드가 호출될 떄 태어나고, 메소드가 끝나면 소멸함.
        // (호출한 메소드에서 넘겨준 참조 자료형은 살아있음)
        int localVariable; // 지역 변수 local variables : 지역 변수를 선언할 때 태어나고, 지역변수를 선언한 중괄호가 끝나면 소멸함.
    }
}
