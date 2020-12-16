package com.godOfJava1.c13.service;

import com.godOfJava1.c13.model.MemberDTO;

// MemberDTO를 관리하는 MemberManager라는 클래스를 만든다.
// 실제 코드는 만들지 않아도, 어떤 메소드들이 있어야 하는지를 정의하려고 할 때 인터페이스를 사용한다.
public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
