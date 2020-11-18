package com.godOfJava1.c6;

public class InterestManager {

    public static void main (String[] args) {
        InterestManager manager = new InterestManager();
        double myMoney = 0;
        for (int day = 10; day <= 365; day += 10) { // 10일 단위이면 시작도 10부터.
            myMoney += manager.calculateAmount(day, 1000000);
            System.out.println(myMoney);
        }
    }

    public double getInterestRate(int day) {
        double rate = 0;
        if (day > 0 && day <= 90) {
            rate = 0.5 / 100;
        }
        if (day > 90 && day <= 180) {
            rate = 1 / 100;
        }
        if (day > 180 && day <= 364) {
            rate = 2 / 100;
        }
        if (day > 364) {
            rate = 5.6 / 100;
        }
        return rate;
    }

    public double calculateAmount(int day, long amount){
        double resultAmount = 0;
        double interest = getInterestRate(day);
        resultAmount = amount + (amount * interest);
        return resultAmount;
    }
}
