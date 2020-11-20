package com.godOfJava1.c7;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();
        array.printArray();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);// 2차원배열은 원하는 차원을 지정하지 않으면 1차원 기준으로 알려준다.
    }

    public void printArray(){
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        for(int oneDimLoop = 0; oneDimLoop < 2; oneDimLoop++) {
            for(int twoDimLoop = 0; twoDimLoop < 3; twoDimLoop++) {
                System.out.println("twoDim[" + oneDimLoop + "][" + twoDimLoop + "]="
                                    + twoDim[oneDimLoop][twoDimLoop]);
            }

        }
    }
    
    public void printArray2() {
        // 성능 측면에서는 이렇게 .length를 for문 안에 넣지 않고 되도록 밖에서 한 번만 읽어오는 게 좋다.
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        int twoDimColLength = twoDim.length; // 이차원배열 세로 높이
        for(int oneDimLoop = 0; oneDimLoop < twoDimColLength; oneDimLoop++) {
            int twoDimRowLength = twoDim[oneDimLoop].length; // 이차원배열 가로 길이
            for(int twoDimLoop = 0; twoDimLoop < twoDimRowLength; twoDimLoop++) {
                System.out.println("twoDim[" + oneDimLoop + "][" + twoDimLoop + "]="
                        + twoDim[oneDimLoop][twoDimLoop]);
            }

        }
    }
}
