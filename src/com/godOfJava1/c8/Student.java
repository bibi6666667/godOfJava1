package com.godOfJava1.c8;

public class Student {
    String name, address, phone, email ; // 같은 타입의 인스턴스변수는 한 줄로 선언해도 ok.
    //String name;
    //String address;
    //String phone;
    //String email;

    public Student(String name){
     this.name = name;
    }

    public Student(String name, String address, String phone, String email){
        // super();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " " + address + " " + phone + " " + email;
    }
}
