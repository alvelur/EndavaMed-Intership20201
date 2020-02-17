package com.patterns.structural.p1.case2;

import com.patterns.structural.p1.dependency.Car;

public class Main {

    public static void main(String[] arg){
        Car car = new Car();
        MovableAdapter movableAdapter = new MovableAdapterImplementation(car);
        System.out.println( movableAdapter.getSpeed());
    }
}
