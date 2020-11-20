package com.godOfJava1.c7;

public class ArrayMain {
    public static void main(String[] args){
        if(args.length > 0) {
            for(String arg : args) {
                System.out.println(arg);
            }
        }
    }
    // args에 전달되는 데이터가 하나라도 있으면 for루프를 돌며 해당 값을 출력한다.
}
