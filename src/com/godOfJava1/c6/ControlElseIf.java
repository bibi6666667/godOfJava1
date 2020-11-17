package com.godOfJava1.c6;

public class ControlElseIf {
    public static void main(String[] args) {
        ControlElseIf control = new ControlElseIf();
        control.elseIf(90);
        control.ifIf(90);
        control.elseIf2(90);
    }
    
    public void elseIf(int point) {
        if(point > 90) { // 90점 초과
            System.out.println("A");
        } else if (point > 80) { // 80점 초과 90점 이하
            System.out.println("B");
        } else if (point > 70) { // 70점 초과 80점 이하
            System.out.println("C");
        } else if (point > 60) { // 60점 초과 70점 이하
            System.out.println("D");
        } else { // 60점 이하
            System.out.println("F");
        }
    }

    public void ifIf(int point) {
        if(point > 90) {
            System.out.println("A");
        }
        if(point <= 90 && point > 80) {
            System.out.println("B");
        }
        if(point <= 80 && point > 70) {
            System.out.println("C");
        }
        if(point <= 70 && point > 60) {
            System.out.println("D");
        }
        if(point <= 60) {
            System.out.println("F");
        }
    }

    public void elseIf2(int point) {
        String result =
                point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : point > 60 ? "D" : "F";
        System.out.println(result);
    }
}
