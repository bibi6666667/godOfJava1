package com.godOfJava1.c18;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDefinition {
    public int number();
    public String text() default "This is first annotation";
    // 어노테이션 선언 : @interface로 선언한다.
    // java.lang.annotation을 import하고 메타어노테이션을 사용해 선언한다.
    // @Target(대상 선언) 과 @Retention(적용범위 선언)을 명시하는 것이 좋다.

}
