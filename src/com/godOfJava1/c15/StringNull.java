package com.godOfJava1.c15;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullCheck2(null);
    }

    public boolean nullCheck(String text) {
        int textLength = text.length(); // text가 null이 됨.
        System.out.println(textLength);
        if (text == null) return true;
        else return false;
    } // NullPointerException발생 - null인 객체의 메소드에 접근했기 때문.

    public boolean nullCheck2(String text) {
        if (text == null) {
            return true;
        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }
}
