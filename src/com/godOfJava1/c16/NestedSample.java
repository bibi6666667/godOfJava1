package com.godOfJava1.c16;

import java.sql.SQLOutput;

public class NestedSample {

    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        // statc nested클래스의 객체 생성은 외부 클래스 이름 뒤에 .을 찍고 쓰면 된다.
        // 객체 생성 이후의 사용법은 일반 클래스와 동일하다.
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }


}
