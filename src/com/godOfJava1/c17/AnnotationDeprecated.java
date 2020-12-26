package com.godOfJava1.c17;

public class AnnotationDeprecated {
    @Deprecated
    // @Deprecated 어노테이션은 더 이상 사용하지 않는 클래스나 메소드를 선언할 떄 사용함.
    // Deprecated된 메소드나 클래스를 사용하면 컴파일할 때 경고를 띄워 줌.
    // 하위 호환성을 위해 Deprecated로 선언한 뒤, 계도기간을 거쳐 클래스나 메소드를 삭제함.
    public void noMoreUse() {
    }
}
