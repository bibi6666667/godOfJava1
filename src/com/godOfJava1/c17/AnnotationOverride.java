package com.godOfJava1.c17;

import com.godOfJava1.c10inheritance.Parent;

public class AnnotationOverride extends Parent{
    // 어노테이션 Annotation : 클래스, 메소드, 변수 등의 선언시 @를 사용하는 것. ( = 메타데이터)
    // @Override 어노테이션 : 해당 메소드가 부모 클래스에 있는 메소드를 Override했다는 것을 명시적으로 선언함.
    @Override // 어노테이션 - Override
    public void printName(/*String args*/) {
        System.out.println("AnnotationOverride");
    }
}
