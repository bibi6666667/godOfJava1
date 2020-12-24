package com.godOfJava1.c15;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods thisClass = new UseStringMethods();

        String str = "The String class represents character strings.";

        thisClass.printWords(str);
        thisClass.findString(str, "string");
        thisClass.findAnyCaseString(str, "string");
        thisClass.countChar(str, 's');
        thisClass.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        String[] strArr = str.split(" ");
        for (String aStr : strArr) {
            System.out.println(aStr);
        }
    }

    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        if (idx != -1) { // findStr에 str가 없을 때는 출력하지 않음.
            System.out.println(findStr + " is appeared at " + idx);
        }
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerCaseStr = str.toLowerCase();
        String lowerCaseFindStr = findStr.toLowerCase(); // 대상 문장도, 대상 단어도 소문자로 바꿔야.
        int idx = lowerCaseStr.indexOf(lowerCaseFindStr); // 소문자로 바꾼 문장에서 소문자로 바꾼 단어 찾기
        if (idx != -1) { // findStr에 str가 없을 때는 출력하지 않음.
            System.out.println(findStr + " is appeared at " + idx);
        }
    }

    public void countChar(String str, char c) {
        char[] strCharArr = str.toCharArray();
        int charCount = 0;
        for (char aChar : strCharArr) {
            if (aChar == c) {
                charCount++;
            }
        }
        System.out.println("char '" + c + "' count is " + charCount);
    }

    public void printContainWords(String str, String findStr) {
        // str 문자열에서 findStr이 포함된 단어 출력
        String[] strArr = str.split(" ");
        for (String aStr : strArr) {
            if (aStr.contains(findStr)) {
                System.out.println(aStr + " contains " + findStr);
            }
        }
    }
}
