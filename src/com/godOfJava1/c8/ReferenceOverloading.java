package com.godOfJava1.c8;

public class ReferenceOverloading {
    public static void main(String[] args){
        ReferenceOverloading reference = new ReferenceOverloading();
    }
    // 메소드 오버로딩 : 메소드 이름은 같고 매개변수들은 다르게 하는 것. 같은 역할의 메소드 = 같은 메소드 이름.
    public void print(int data){

    }
    public void print(String data){

    }
    public void print(int intData, String stringData){

    }
    public void print(String stringData, int intData){

    }
}
