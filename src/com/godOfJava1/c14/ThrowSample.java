package com.godOfJava1.c14;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwsException(13); // throws로 선언된 메소드 호출부분.
        } catch (Exception e) {

        }
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
                // 개발자가 예외를 직접 정의해 발생시키는 방법. (사용자 정의 예외)
                // try 블록에 throw 라고 명시한 후, 예외 클래스의 객체를 생성한다.
                // 예외발생상황과 동일하게, 예외 이후 try블록 문장은 실행되지 않고 catch블록으로 이동한다.
                // 만약 해당하는 예외가 없으면, 발생된 예외는 메소드 밖으로 던져진다. (이 메소드를 호출한 메소드로)
            }
            System.out.println("Number is " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception { // throws 선언된 메소드를 호출한 메소드에서는 try-catch로 호출 부분을 감싸야 한다.
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }
    
    public void multiThrows() throws NullPointerException, Exception {
        // 메소드에서 두 개 이상의 예외를 던질 수 있다면, throws 구문에 콤마로 구분해 예외 클래스를 나열한다.
    }   
}
