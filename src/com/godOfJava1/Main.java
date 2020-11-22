package com.godOfJava1;

import com.godOfJava1.c9.Sub;
import com.godOfJava1.c9.SubStatic;
// import 란.. 다른 패키지에 있는 클래스에 접근하기 위해 사용하는 예약어
// import 패키지이름 클래스이름; 으로 선언하면 컴파일러가 그 패키지의 그 클래스를 읽어와 사용한다.

import static com.godOfJava1.c9.SubStatic.subStaticMethod;
import static com.godOfJava1.c9.SubStatic.CLASS_NAME;
// import static으로 다른 패키지의 static변수들을 선언하면 객체를 불러오지 않고도 바로 사용 가능하다.
/*또는*/import static com.godOfJava1.c9.SubStatic.*; //처럼 한 줄로도 선언 가능.

public class Main {

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.subClassMethod();
        /*SubStatic.*/subStaticMethod();
        System.out.println(/*SubStatic.*/CLASS_NAME);
    }
}
