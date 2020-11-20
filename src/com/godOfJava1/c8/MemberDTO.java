package com.godOfJava1.c8;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    public MemberDTO(){
        // 기본 생성자 - 아무 정보도 모를 때
    }
    public MemberDTO(String name){
        // 이름을 받는 생성자 - 이름만 알 때
        this.name = name; // this = MemberDTO라는 클래스 자신을 가리킴
    }
    public MemberDTO(String name, String phone){
        // 이름,전화번호를 받는 생성자 - 이름, 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email){
        // 이름,전화번호,메일주소를 받는 생성자 - 모든 정보를 알 때
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO getMemberDTO() {
        MemberDTO dto = new MemberDTO();
        int age = 0;
        String name = null;
        String phone = null;
        String email = null;
        return dto;
        // DTO의 장점 : 복합적인 데이터(String, int ..) 를 리턴해야 할 때.
        // DTO객체를 만들고 그 객체를 리턴할 수 있다!
    }
}
