package com.godOfJava1.c7;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        array.twoDimForWithCounter();
    }

    public void newFor() {
        int[] oneDim = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int data : oneDim) {
            System.out.println(data);
        }
        // for 루프의 간단 구문. for(임시변수타입 임시변수명 : 반복대상객체)
        // 반복대상객체 = for문 반복을 수행할 대상 객체. 배열 및 컬렉션 일부를 사용 가능함.
        // 임시변수 = 반복대상객체의 각 데이터를 임시로 담아둘 변수
        // 장점 : for문을 간단하게 사용가능
        // 단점 : 루프에서 각 배열의 인덱스를 알 수 없다 -> 임시변수를 두어야 함 -> 그럴 바엔 일반 for문을 쓰는 게 낫다.
        // 결론 ) 배열의 값만 처리할 때는 for ( : ) 를, 배열의 인덱스도 필요할 때는 for ( ; ; )를 사용한다.
    }

    //ArrayLength클래스의 printArray2를 위의 간단구문을 사용해 고쳐 보자.
    public void twoDimFor() {
        int[][] twoDim = {{1, 2, 3},{4, 5, 6}};
        for(int[] dimArray : twoDim) {
            for(int data : dimArray) {
                System.out.println(data);
            }

        }
    }

    public void twoDimForWithCounter() {
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        int oneCounter = 0; // 2차원배열의 1차원 인덱스를 얻기 위한 카운터(임시변수)
        for (int[] dimArray : twoDim) {
            int twoCounter = 0; // 2차원배열의 2차원 인덱스를 얻기 위한 카운터(임시변수)
            for (int data : dimArray) {
                System.out.println(data);
                twoCounter++;
            }
            oneCounter++;
        }
    }
}
