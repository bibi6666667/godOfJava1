package com.godOfJava1.c16;

public class InnerSample {
    public static void main(String args[]) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        // 내부클래스의 객체를 생성하기 전에는 먼저 내부클래스를 감싼 외부클래스의 객체를 만들어야만 한다.
        // 만든 외부클래스 객체를 통해 내부클래스의 객체를 만들어 낼 수 있다.
        inner.setValue(3);
        System.out.println(inner.getValue());// 3
        // 내부클래스 객체를 사용하는 방법은 다른 클래스와 동일하다.
    }
    // 내부클래스는 GUI프로그램 개발에 가장 많이 사용되며, 특히 이벤트리스너를 처리할 때 많이 사용된다.
    // 하나의 클래스를 별도로 만드는 것보다 내부 클래스를 만드는 게 더 편하기 때문에 주로 사용한다.
}
