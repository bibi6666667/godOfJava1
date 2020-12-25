package com.godOfJava1.c16;

import java.util.EventListener;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonListener();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous(){
        // 익명 클래스 만들기.
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() { // 메소드 내에 생성자 호출 - 중괄호 열고 원하는 메소드 구현 - 중괄호 닫고 메소드 종료.
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");;
            }
        });
        button.onClickProcess();
        // 익명 클래스 - 클래스에 이름이 없지만 onClick()과 같은 메소드를 구현할 수 있다.
        // 주의 : 괄호를 잘 닫아야. 메소드 내에 생성자,메소드가 있는 것이므로 25번 줄처럼 소괄호 닫고 세미콜론을 넣어야 한다.
        // 장점 : 클래스/내부클래스를 많이 만들수록 메모리를 더 차지하는데, 익명클래스로 메모리를 덜 차지하면서 객체를 생성할 수 있다.(속도up)
        // 단점 : 클래스 이름도, 객체 이름도 없기 때문에 다른 클래스/메소드에서는 참조 및 재사용할 수 없다.
        // 재사용하려면 아래 setButtonListenerAnonymousObject()처럼 객체를 따로 생성 및 사용해야 한다.
    }

    public void setButtonListenerAnonymousObject(){
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }

    class MagicButtonListener implements EventListener {
        public void onClick() {
            System.out.println("Magic Button Clicked!!!");
        }
    }
}
