package com.godOfJava1.c15;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        //sample.checkString();
        //sample.checkCompare();
        sample.checkCompareTo();
    }

    public void checkString() {
        String text = "You must know String class.";
        System.out.println("text.length() = " + text.length()); // length() : 문자열의 길이를 확인하는 메소드
        String korean = "자바";
        System.out.println(korean.length());
        System.out.println("text.isEmpty() = " + text.isEmpty()); // isEmpty() : 문자열이 비어있는지 확인하는 메소드. 비어있으면 true
    }

    public void checkCompare() {
        String text = "Check value";
        // String text2 = "Check value"; // same
        String text2 = new String("Check value"); // different
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different.");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same.");
        }
        // Constant Pool : 자바에서 객체를 재사용하기 위한 시스템. String의 경우 동일한 값의 객체는 이미 만든 객체를 재사용한다.
        String text3 = "check value";
        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void checkCompareTo() {
        // A.compareTo(B) : B를 기준으로 A의 위치를 알려줌. 리턴값이 양수 -> 리턴값만큼 A가 뒤에 있다 / 음수 -> 리턴값만큼 A가 앞에 있다.
        String texta = "a";
        String textA = "A";
        String textb = "b";
        String textC = "C";
        String textc = "c";
        String textZ = "Z";
        String textz = "z";
        System.out.println(textb.compareTo(texta));
        System.out.println(textb.compareTo(textc));
        System.out.println(texta.compareTo(textc));
        System.out.println(texta.compareTo(texta));
        System.out.println(textc.compareTo(textC));
        System.out.println(texta.compareToIgnoreCase(textA));
        System.out.println(textZ.compareTo(textz));

    }
}
