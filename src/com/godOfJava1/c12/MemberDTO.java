package com.godOfJava1.c12;

import java.util.Objects;

public class MemberDTO { // 8장의 MemberDTO 복붙
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {
        // 기본 생성자 - 아무 정보도 모를 때
    }

    public MemberDTO(String name) {
        // 이름을 받는 생성자 - 이름만 알 때
        this.name = name; // this = MemberDTO라는 클래스 자신을 가리킴
    }

    public MemberDTO(String name, String phone) {
        // 이름,전화번호를 받는 생성자 - 이름, 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        // 이름,전화번호,메일주소를 받는 생성자 - 모든 정보를 알 때
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public com.godOfJava1.c8.MemberDTO getMemberDTO() {
        com.godOfJava1.c8.MemberDTO dto = new com.godOfJava1.c8.MemberDTO();
        int age = 0;
        String name = null;
        String phone = null;
        String email = null;
        return dto;
        // DTO의 장점 : 복합적인 데이터(String, int ..) 를 리턴해야 할 때.
        // DTO객체를 만들고 그 객체를 리턴할 수 있다!
    }

    // Overriding - equals() 정석대로 오버라이딩
    public boolean equals(Object obj) {
        if (this == obj) return true; // 주소값이 같으므로 당연히 true
        if (obj == null) return false; // obj가 null이므로 당연히 false
        if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false
        MemberDTO other = (MemberDTO) obj; // 같은 클래스이므로 형변환 실행

        // 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행

        if (name == null) { // name이 null일 때,
            if (other.name != null) return false; // 비교 대상의 name이 null이 아니면 false
        } else if (!name.equals(other.name)) return false; // 두 개의 email값이 다르면 false

        if (email == null) { // email이 null일 때, ( 위와 같은 비교 수행 )
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        // 위의 모든 비교를 거쳐 false를 리턴하지 않은 객체는, 같은 값을 가지는 객체로 생각해서 true를 리턴한다.
        return true;
    }
    
    // Overriding - hashCode() 정석대로 오버라이딩
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}

