package com.godOfJava1.c13.service;

import com.godOfJava1.c13.model.MemberDTO;

public class MemberManagerImpl2 extends MemberManagerAbstract{
    public boolean addMember(MemberDTO member) {
        return false;
    }

    public boolean removeMember(String name, String phone) {
        return false;
    }

    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
// abstraact클래스 구현하기 : 상속과 똑같이 extends를 사용한다.
// abstract클래스를 상속받으면, 구현되지 않은 메소드(abstract메소드)들을 구현해야만 정상적으로 컴파일 및 실행이 된다.

