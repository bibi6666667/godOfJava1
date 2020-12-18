package com.godOfJava1.c13;

public class FinalVariable {
    final int instanceVariable = 1;
    // 변수에 final을 선언하면 그 변수는 '더 이상 바꿀 수 없다'는 뜻이다.
    // 인스턴스 변수 / 클래스 변수에 final 선언 시, 반드시 생성과 동시에 초기화를 해야 한다.
    // 그렇지 않으면 아래 에러가 뜬다.
    // error : variable instanceVariable not initialized in the default constructor

    public void method (final int parameter) {
        final int localVariable;
        localVariable = 2;
        // localVariable = 3;
        // parameter = 4;
    }
    // 매개변수로 final을 선언하면, 값을 다시 할당할 수 없다.
    // 지역변수로 final을 선언하면, 초기화한 값 외에 다른 값으로 다시 할당할 수 없다.
}
