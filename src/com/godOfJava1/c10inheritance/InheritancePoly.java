package com.godOfJava1.c10inheritance;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }
    public void callPrintNames(){
        Parent parent1 = new Parent();
        Parent parent2 = new Child(); // 자식타입을 부모타입으로 형변환
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
