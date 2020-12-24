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
        int index = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + index);
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerCaseStr = str.toLowerCase();
        int index = lowerCaseStr.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + index);
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
