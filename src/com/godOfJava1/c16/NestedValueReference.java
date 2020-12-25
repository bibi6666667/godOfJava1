package com.godOfJava1.c16;

import java.util.EventListener;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;

    static class StaticNested {
        // Static Nested 클래스에서는 외부 클래스의 'static'변수만 참조할 수 있다. (static변수가 아닌 변수는 참조할 수 없다)
        public void setValue() {
            staticInt = 14;
        }
    }

    class Inner {
        // inner 클래스(내부클래스) 에서는 외부 클래스의 모든 변수를 참조할 수 있다. (public, protected, default, private, static)
        public void setValue() {
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }

    public void setValue() {
        // anonymous클래스(익명클래스) 역시 외부 클래스의 모든 변수를 참조할 수 있다. (public, protected, default, private, static)
        EventListener listener = new EventListener() { // 생성자 호출 후 메소드 구현 - 익명클래스
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }
}
