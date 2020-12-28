package com.godOfJava1.c18;

public class Overloading {
    // Overloading : 메소드의 이름은 동일하지만 매개변수를 다르게 하는 것.
    // 기능은 동일하지만, 메소드에 넘겨줄 수 있는 매개변수 타입을 다양하게 함으로써 메소드 사용을 쉽게 함.
    // 아래 getData()는 매개변수에 따라 호출되는 메소드가 달라진다. 이런 구현을 Overloading이라고 한다.
    public void getData(){
    }

    public void getData(int value) {
    }

    public void getData(String value) {

    }
}
