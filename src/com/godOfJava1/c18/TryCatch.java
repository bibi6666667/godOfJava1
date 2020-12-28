package com.godOfJava1.c18;

public class TryCatch {
    // 예외 처리 : 자바에서 발생가능한 예외를 처리할 떄는 try-catch문을 사용한다.
    public void tryCatch() throws Exception{
        try {
            // 예외가 발생 가능한 문장
            throw new Exception("This is Exception");
            // throw : try블록 내에서 예외를 발생시킬 경우 사용하는 예약어. new로 예외객체를 생성하거나 정의된 예외객체를 명시함.
            // throw로 예외객체를 던지면 catch블록에서 처리되거나, throws선언에 포함되어 있어야 한다.
        } catch (NullPointerException e1) {
            // NullPointerException이 발생했을 때 처리문장
        } catch (Exception e2) {
            // Exception이 발생했을 때 처리문장
        } finally {
            // try나 catch가 어떻게 수행되었든 간에 반드시 수행되는 문장
        }
    }
}
