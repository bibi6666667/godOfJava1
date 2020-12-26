package com.godOfJava1.c17;

// @UserAnnotation(number = 0) : 어노테이션은 클래스에도 지정할 수 있으나, @UserAnnotation 어노테이션은 범위가 메소드까지라 에러가 발생함.
// 클래스에서도 사용할 수 있게 하려면 @UserAnnotation 선언에서 @Target 범위를 넓혀야 한다. (UserAnnotation.java 9번 줄 참고)
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
