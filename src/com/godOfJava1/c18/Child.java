package com.godOfJava1.c18;

public class Child extends Parent{ // Parent 클래스 상속받음
    public void method() {
        // method()는 부모 클래스의 method()를 덮어 쓴 Overriding 처리가 된 것이다.
    }
    // 오버라이딩 Overriding : 부모 클래스에 선언된 메소드와 동일한 선언을 갖지만 구현이 다른 것.
    // 오버라이딩은 자바에서 다형성을 제공하는 방법 중 하나이다.
}
