package com.godOfJava1.c16;

public class MyPage {
    InputBox input;

    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI() {
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
        //  7. InputBox 클래스에 선언된 listenerCalled() 메소드를 호출하여 onKeyDown()이벤트와 onKeyUp()이벤트가 수행되도록 하자.
//      InputBox inputBox = new InputBox();
//      inputBox.listenerCalled(2);
//      inputBox.listenerCalled(4); 이렇게 호출하는 것이 아닌..
        input.listenerCalled(InputBox.KEY_DOWN);
        input.listenerCalled(InputBox.KEY_UP); // 이렇게 해야 한다.
    }
}
