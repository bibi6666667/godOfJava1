package com.godOfJava1.c16;

public class University {
    static class Student {
        // static nested클래스를 만드는 이유 : 클래스를 묶기 위해.
        // Student라는 클래스가 School의 학생인지 University의 학생인지 불분명할 때,
        // 각 클래스의 static nested클래스로 만들어 그 클래스의 용도를 명확하게 할 수 있다.
        // 또 School.Student클래스는 School클래스에서만, University.Student클래스는 University클래스에서만 사용할 수 있다.
        // 결론 : 겉보기에 유사하지만, 내부적으로 구현이 달라야 할 때 static nested클래스를 사용한다.
    }
}
