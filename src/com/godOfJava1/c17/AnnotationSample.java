package com.godOfJava1.c17;

public class AnnotationSample {
    // @SuppressWarnings 어노테이션 : 어떤 경고가 발생할 떄, 경고 메시지가 나타나지 않도록 하는 어노테이션.
    // 단점 : Deprecated된 메소드를 사용해도 모를 수 있으니 남용하지 말아야 한다.
    @SuppressWarnings("deprecation") // 소괄호 안에 발생하는 경고명을 적는다.
    public void useDeprecated() {
        AnnotationDeprecated child = new AnnotationDeprecated();
        child.noMoreUse();
    }
}
