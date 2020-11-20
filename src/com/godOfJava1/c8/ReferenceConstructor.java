package com.godOfJava1.c8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject(){
        // 모두 MemberDTO의 객체들이지만 속성값은 다르다. (각각 다른 생성자 사용했기 때문)
        MemberDTO dto1 = new MemberDTO(); // 기본생성자이므로 모든 값이 null이다
        MemberDTO dto2 = new MemberDTO("Sangmin"); // 이름만 지정되어 있고, 나머지는 null이다
        MemberDTO dto3 = new MemberDTO("Sangmin", "01012345678");
        // 이름, 전화번호는 지정되어 있고, 이메일은 null
        MemberDTO dto4 = new MemberDTO("Sangmin", "01012345678", "god@godofjava.com");
        // 모든 속성값이 지정되어 있다.
    }
}
