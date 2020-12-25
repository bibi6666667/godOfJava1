package com.godOfJava1.c16;

public class OuterOfInner {
    class Inner { //  내부 클래스
        private int value = 0;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
