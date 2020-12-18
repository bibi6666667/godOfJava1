package com.godOfJava1.c13.service;

import com.godOfJava1.c13.model.MemberDTO;

// MemberDTO를 관리하는 MemberManager라는 클래스를 만든다.
// 실제 코드는 만들지 않아도, 어떤 메소드들이 있어야 하는지를 정의하려고 할 때 인터페이스를 사용한다.
public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
// (abstract 클래스와 비교)
// 인터페이스는 선언시 interface라는 예약어를 사용함.
// 각 메소드 선언문은 일반 메소드 선언문과 동일하지만, 메소드의 몸통이 없음.
// static이나 final메소드가 선언되어 있으면 안 됨.
// 인터페이스를 구현할 때는 implements 라는 예약어를 사용한다.
