package com.godOfJava1.c12;

import java.util.Scanner;

public class ToString {
    public static void main(String args[]) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2();
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        // 객체를 그냥 출력하는 것과, 객체의 toString()메소드를 호출하는 것은 동일한 결과를 갖는다.
        System.out.println("plus " + obj);
        // String을 제외한 참조타입에 더하기 연산을 수행하면, 자동으로 toString()메소드가 호출되어 객체의 위치에 String값이 놓이게 된다.
    }

    public void toStringMethod2(){
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }

    public String toString() { // Overriding
        return "ToString class";
    }
}
