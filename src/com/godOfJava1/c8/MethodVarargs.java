package com.godOfJava1.c8;

public class MethodVarargs { // 매개변수를 지정하는 특이한 방법
    // 매개변수 수를 정하기 애매할 때.
    // 매개변수를 몇 개나 받아야할지 모르거나, 호출할 때마다 매개변수의 수가 바뀔 때 사용가능.
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        varargs.calculateNumbers(1, 2, 3, 4, 5);
        varargs.printfTest();
    }
    public void calculateNumbersWithArray(int[] numbers){    }
    public void calculateNumbers(int...numbers){ // 배열이 아닌 int값들을 받을 수 있는 메서드. ... 연달아 입력
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total = " + total);
    }
    public void printfTest(){
        // System.out.printf(); 은 printf(String format, Object...args) 로 정의되어 있다.
        MemberDTO dto = new MemberDTO("Sangmin", "010XXXXYYYY", "javatuning@gmail.com");
        System.out.printf("Name : %s Phone : %s E-Mail : %s", dto.name, dto.phone, dto.email);
    }
}
