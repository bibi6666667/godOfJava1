package com.godOfJava1.c16;

import java.util.EventListener;

public class MagicButton {
    public MagicButton() {

    }
    private EventListener listener;
    public void setListener(EventListener listener) {
        this.listener = listener;
    }
    public void onClickProcess() {
        if (listener != null) { // listener가 null이 아닐 때만.
            //listener.onClick();
        }
    }
}
