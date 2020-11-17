package com.godOfJava1.c6;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf control = new ControlIf();
        control.ifStatement();
    }

    public void ifStatement() {
        if (true);
        if (true) System.out.println("It's true");
        if (true)
            System.out.println("It's also true"); // if문은 세미콜론 만날때까지가 한 줄.
        if (false)
            System.out.println("It's false"); // if문이 true일 때만 뒤의 구문이 실행.
    }
}
