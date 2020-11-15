package com.godOfJava1.c4;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint pp = new ProfilePrint();
        // 헷갈린다..;; 인스턴스변수로 선언해도 지역변수로 한번 더 선언해야 하나?
        byte age = 25;
        String name = "bibi";
        boolean isMarried = false;

        // set : 지역변수로 set
        pp.setAge(age);
        pp.setName(name);
        pp.setMarried(isMarried);

        // get : 지역변수를 인스턴스변수로 get?
        System.out.println(pp.getAge());
        System.out.println(pp.getName());
        System.out.println(pp.isMarried());
    }

    public void setAge(byte paraage) {
        // 좌항의 age는 맨 위의 인스턴스변수, 우항은 main()에서 받아오는 값
        age = paraage;
    }

    public byte getAge() {
        return age; // 이 age도 맨 위의 인스턴스변수.
    }

    public void setName(String paraname) {
        name = paraname;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean paraIsMarried) {
        isMarried = paraIsMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
