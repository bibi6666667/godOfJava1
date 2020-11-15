package com.godOfJava1.c4;

public class PrimitiveTypes {

    int intDefault1;

    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
        types.checkChar();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        byteMin = (byte)(byteMin - 1);
        byteMax = (byte)(byteMax + 1);
        System.out.println("byteMin - 1 = " + byteMin);
        System.out.println("byteMax + 1 = " + byteMax);
    }

    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
        int intValue = '가'; // '가'의 유니코드 번호 가져옴
        char charValue = '가';
        char ga1 = '\u4403';
        char ga2 = 44032;

        System.out.println("intValue = [" + intValue + "]");
        System.out.println("charValue = [" + charValue + "]");
        System.out.println(ga1);
        System.out.println(ga2);
    }


}
