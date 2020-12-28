package com.godOfJava1.c18;

public class SecondChild extends Parent{ // Parent 클래스 상속받음
    public void method() {
        // 상속 inheritance : 부모에 선언된 변수와 메소드에 대한 사용권을 갖는 것. extends로 확장하거나, implements로 구현한 경우에 해당함.
        // 다형성 Polymorphism : 부모클래스에서 파생된 자식클래스들의 기능이 각기 다를 수 있다.
        // FirstChild와 SecondChild에 있는 method()는 다른 기능을 수행해도 무관하다.
    }
}
