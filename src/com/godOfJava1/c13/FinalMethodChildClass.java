package com.godOfJava1.c13;

public class FinalMethodChildClass /*extends FinalMethodClass*/{
    public void printLog(String data) {
        System.out.println("Data = " + data);
    }
}
// error : printLog(String) in FinalMethodClass cannot override printLog(String) in FinalMethodClass. overridden method is final.
// 메소드를 final로 선언하면 더 이상 overriding할 수 없다.
// 내가 만든 메소드를 누가 변경하거나 덮어쓰지 못하게 하기 위해 사용한다.