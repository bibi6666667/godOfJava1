package com.godOfJava1.c13.service;

import com.godOfJava1.c13.model.MemberDTO;

// 318 abstract클래스
public abstract class MemberManagerAbstract {
    public abstract boolean addMember (MemberDTO member);
    public abstract boolean removeMember (String name, String phone);
    public abstract boolean updateMember (MemberDTO member);
    public void printLog(String data) {
        System.out.println("Data = " + data);
    }
}
// abstract클래스는 abstract로 선언한 메소드가 하나라도 있을 때 선언한다.
// abstract클래스는 자바가 마음대로 초기화 및 실행할 수 없다. abstract클래스를 구현해 놓은 클래스로 초기화 및 실행이 가능하다.
// 선언 시 class 앞에 abstract라는 예약어를 사용한다.
// 몸통이 없는 메소드 선언문에도 abstract를 명시한다.
// 구현되어 있는 (몸통이 있는) 메소드가 있어도 상관없다.
// static메소드나 final메소드가 있어도 괜찮다.
// abstract클래스를 구현할 때는 extends라는 예약어를 사용한다 (클래스이므로).
