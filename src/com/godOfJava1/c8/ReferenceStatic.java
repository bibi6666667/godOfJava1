package com.godOfJava1.c8;

public class ReferenceStatic {
    String name = "Min";
    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
        // ReferenceStatic.staticMethodCallVariable();
        // 에러 - staticMethodCallVariable()은 static메서드가 아니므로 객체를 생성해야만 호출할 수 있다.
    }
    public static void staticMethod(){
        System.out.println("This is a staticMethod.");
    }
    public void staticMethodCallVariable(){
         System.out.println(name); //- 에러. static메소드는 클래스변수(static이 붙은 인스턴스변수)만 사용 가능하다.
        //java: non-static variable name cannot be referenced from a static context
    }
}
