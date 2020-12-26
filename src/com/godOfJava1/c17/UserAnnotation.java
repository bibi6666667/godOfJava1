package com.godOfJava1.c17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // @Target : 어노테이션 사용 대상 지정. METHOD - 메소드에 사용 가능.
@Retention(RetentionPolicy.RUNTIME) // @Retention : 어노테이션 유지 정보를 지정. RUNTIME - 실행 시 이 어노테이션을 참조.
public @interface UserAnnotation { // class나 interface처럼, 어노테이션을 선언하는 예약어. 이렇게 선언해야 @UserAnnotation을 사용가능함.
    public int number();
    public String text() default "This is first annotation";
    // 어노테이션 선언 내의 메소드 : 이 어노테이션을 사용할 떄 해당 항목에 대한 타입으로 값을 지정할 수 있다.
    // default : default 뒤의 값이 이 어노테이션을 사용할 떄의 기본값이 된다. (값을 지정하지 않아도 default값으로 지정된다)
}
