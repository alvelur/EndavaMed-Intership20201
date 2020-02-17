package com.patterns.structural.p2.case2;

import com.patterns.structural.p2.dependency.Car;
import com.patterns.structural.p2.dependency.Movable;

public class Main {

    public static void main(String[] arg){
        Movable movable = new AnotherCar(new Car());
        System.out.println(movable.getColor());
    }
}
