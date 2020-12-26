package com.godOfJava1.c17;

import java.lang.reflect.Method;
// 아래의 Class, Method 클래스는 자바의 Reflection(리플렉션) 이라는 API에서 제공하는 클래스들이다.
// Class 클래스  : 클래스의 정보를 확인
// Method 클래스 : 메소드의 정보를 확인

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods();
        // getDeclaredMethods() : Class클래스에 선언된 메소드로, 호출하면 해당 클래스에 선언된 메소드 목록을 배열로 리턴함.
        for (Method tempMethod : methods) {
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
            // getAnnotation() : Method클래스에 선언된 메소드로, 호출하면 해당 메소드에 선언된 매개변수로 넘겨준 어노테이션이 있는지 확인하고, 있을 경우 그 어노테이션의 객체를 리턴함.
            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                // 어노테이션에 선언된 메소드를 호출하면, 그 값을 리턴함.
                System.out.println(tempMethod.getName() + "() : number = " + number + " text = " + text);
            } else {
                System.out.println(tempMethod.getName() + "() : annoation is null");
            }
        }
    }

}
