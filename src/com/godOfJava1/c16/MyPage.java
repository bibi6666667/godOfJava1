package com.godOfJava1.c16;

import java.security.Key;

public class MyPage {
    static InputBox input;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI(){
        input = new InputBox(); // 참조타입 만들떄는 new필요..
        KeyEventListener listener = new KeyEventListener() { // KeyEventListener를 구현한 익명 클래스
            public void onKeyDown() {
                System.out.println("Key Down");
            }
            
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };
        input.setKeyListener(listener);
    }

    public void pressKey() {
        InputBox inputBox = new InputBox();
        inputBox.listenerCalled(4);
        inputBox.listenerCalled(2);
    }
}
