package com.godOfJava1.c17;

public class UserAnnotationSample {
    // 아래처럼 메소드를 선언할 때, UserAnnotation에서 직접 만든 어노테이션을 사용할 수 있다.
    // 어노테이션 선언 클래스의 각 메소드 이름에 해당하는 값을 소괄호 안에 넣어 주어야 한다.
    @UserAnnotation(number = 0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UserAnnotation(number = 1)
    public void annotationSample1() {
    }

    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2() {
    }

    @UserAnnotation(number = 3, text = "third")
    public void annotationSample3() {

    }
}
