package com.godOfJava1.c18;

// 객체지향 관련 용어 목록.
public class Common { // 클래스 Class - (사물을 나타내며) 상태와 행위를 갖는 자바의 기본 단위. 사물의 단위.
    // 캡슐화 Encapsulation : 연관된 상태와 행위를 결정하는 기능을 묶어 주는 것. 캡슐화로 묶인 가장 작은 단위가 클래스이다.
    // 모듈화 modularity : 하나의 객체를 위한 코드가 다른 객체를 위한 코드와 무관하게 수행됨.
    // 정보 은닉 information hiding : 클래스 밖에서 접근 가능한 대상을 제한함. 접근제어자(private 등)으로 가능함.
    private int state; // 상태 state - 자바에서 상태는 클래스/인스턴스변수로 표현.
    // 객체 Object : 각 사물을 의미함. 클래스 = 사물의 단위, 객체 = 각 사물. 예를 들어 클래스 = 책 이면 객체 = 어린왕자, 데미안..이 될 수 있음 
    
    public void setState(int newState) { // 행위 behavior - 자바에서 행위는 메소드로 표현.
        // 상태(여기서는 인스턴스변수)를 변경 가능
        // 메시지 Message : 메소드에서 다른 메소드를 호출할 때 전달하는 값. 자바에서는 매개변수에 해당함.
    }

}
