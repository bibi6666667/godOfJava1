package com.godOfJava1.c1_3;

public class Car {
    public static void main (String[] args) {
        Car dogCar = new Car();
        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        System.out.println(dogCar.getCurrentSpeed());
    }

    int speed;
    int distance;
    String color;

    public Car() {
    }

    public void speedUp(){
        speed = speed + 5;
    }

    public void breakDown(){
        speed = speed - 10;
    }

    public int getCurrentSpeed(){
        return speed;
    }
}