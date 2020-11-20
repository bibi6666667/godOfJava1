package com.godOfJava1.c8;

public class ReferenceReturn {
    public static void main(String args[]){
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }
    public int intReturn(){
        int returnInt = 0;
        return returnInt;
    }
    public int[] intArrayReturn(){
        int returnArray[] = new int[10];
        return returnArray;
    }
    public String stringReturn(){
        String returnString = "Return value";
        return returnString;
    }
    public int calculateAfterIntReturn(){
        int returnInt = 0;
        return returnInt;
        // returnInt++; // 에러 - unreachable statement.
        // return은 리턴값을 넘겨주고 그 위치에서 메서드를 종료함.
    }
    public int ifConditionIntReturn(){
        int returnInt = 0;
        if(returnInt == 0) {
            return ++returnInt;
        } else {
            return --returnInt;
        }
    }
    public int ifConditionNoElseIntReturn(){
        int returnInt = 0;
        if(returnInt == 0) {
            return ++returnInt;
        }
        return --returnInt;
    }
    public void wantToStopInTheMiddle(boolean flag){
        // 항상 실행할 코드
        if(flag) return; // flag가 true이면 함수를 여기서 종료함.
        // flag가 false일 때만 실행할 코드
    }
}
