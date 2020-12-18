package com.godOfJava1.c13;

import com.godOfJava1.c13.model.MemberDTO;

// 참조타입에 대한 final선언
public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
        // dto = new MemberDTO();
        // error : cannot assign a value to final variable dto (final로 선언된 인스턴스 변수 dto는 값을 할당할 수 없다)
        // 기본 자료형과 마찬가지로, 참조타입도 final로 선언되면 두 번 이상 값을 할당하거나 새로 생성자를 이용하여 초기화할 수 없다.

        dto.name = "Sangmin";
        System.out.println(dto);
        // 하지만 위와 같이 final로 선언된 객체 dto의 인스턴스변수나 클래스변수까지 모두 final로 선언되지 않았다면, 값을 할당할 수 있다.
        // 해당 클래스가 final이지, 그 안의 인스턴스변수나 클래스변수까지 모두 final이 되는 것은 아니다.
    }
}
