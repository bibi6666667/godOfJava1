package com.godOfJava1.c8;

public class ReferenceStaticVariable {
    String name; // 인스턴스변수 name - checkName()결과로 둘 다 "Sangmin"이 나온다.
    //static String name; // 클래스변수 name - checkName의 결과로 "Sangmin","Sungchoon"이 나온다.
    public ReferenceStaticVariable() {} // 기본생성자
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }
    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(reference1.name);
    }
}
