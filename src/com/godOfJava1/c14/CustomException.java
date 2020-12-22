package com.godOfJava1.c14;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try {
            sample.throwMyException(13);
        } catch (MyException mye) {
            mye.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    // 예외 메시지 형태
    // com.godOfJava1.c14.MyException: Number is over than 12
    //	at com.godOfJava1.c14.CustomException.throwMyException(CustomException.java:16)
    //	at com.godOfJava1.c14.CustomException.main(CustomException.java:7)
}
