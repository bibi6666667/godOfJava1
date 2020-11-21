package com.godOfJava1.c8;

import java.lang.reflect.Member;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByValue(); // 값에 의한 전달은 대상의 값을 복사해 전달하는 것이므로 원래 값은 그대로이다.
        // 기본타입은 모두 passByValue이며, 참조타입을 호출한 메서드에서 새 객체를 만들어 처리하면 passByValue처럼 기존 값은 그대로이다.
        reference.callPassByReference(); // 참조에 의한 전달은 값 자체가 아닌 값의 위치(주소)를 전달하는 것이므로 원래 값도 바뀐다.
        // 즉 passByReference로 값이 전달되면, 호출한 메소드의 데이터에도 영향이 있다.
        // 참조타입을 메소드의 매개변수로 넘길 때 영향을 받는다.
    }

    public void callPassByValue(){
        int a = 10;
        String b = "b"; // String은 예외적으로 ="";로 선언해도 new로 선언한 것 처럼 기능(새로운 객체 만들어짐)
        System.out.println("before passByValue");
        System.out.println("a = " + a );
        System.out.println("b = " + b );
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void callPassByReference(){
        MemberDTO member = new MemberDTO("Sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name = " + member.name);
    }

    public void passByReference(MemberDTO member){
        member.name = "Sungchoon";
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);

    }
}
