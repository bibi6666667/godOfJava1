package com.godOfJava1.c7;

public class ArrayTwoDimension {// 2차원 배열 - Two-dimensional Array
    public static void main(String[] args) {
        ArrayTwoDimension array = new ArrayTwoDimension();

    }

    public void twoDimensionArray(){
        int[][] twoDim;
        twoDim = new int[2][3];

        twoDim[0] = new int[3];
        twoDim[1] = new int[2]; // 2층과 2층 크기 다르게 하기.

        int[][] twoDim2 = {{1, 2, 3}, {4, 5, 6}};
        // 위와 아래 선언은 같은 결과이다.
        twoDim2[0][0] = 1;
        twoDim2[0][1] = 2;
        twoDim2[0][2] = 3;

        twoDim2[1][0] = 4;
        twoDim2[1][1] = 5;
        twoDim2[1][2] = 6;

    }
}
