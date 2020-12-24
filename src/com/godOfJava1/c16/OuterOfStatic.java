package com.godOfJava1.c16;

public class OuterOfStatic {
    static class StaticNested { // OuterOfStatic 클래스의 static nested class.
        // 컴파일하면 각각 하나씩 클래스 파일이 만들어지고, Nested클래스는 OuterOfStatic$StaticNested.class 라는 이름으로 만들어진다.
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
