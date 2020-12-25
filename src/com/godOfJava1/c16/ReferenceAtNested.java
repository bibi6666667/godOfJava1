package com.godOfJava1.c16;

public class ReferenceAtNested {
    // 외부클래스에서 내부클래스 (static nested클래스, inner클래스)의 인스턴스 변수에 접근하는 것도 가능하다.
    // 각 내부클래스의 객체를 생성한 뒤, 그 값을 참조하는 방식으로 접근할 수 있다. (private변수도 모두 접근가능)
    static class StaticNested {
        private int staticNestedInt = 99;
    }

    class Inner {
        private int innerValue = 100;
    }

    public void setValue(int value) {
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
}
