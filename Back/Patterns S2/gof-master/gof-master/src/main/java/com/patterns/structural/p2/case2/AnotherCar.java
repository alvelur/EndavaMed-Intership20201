package com.patterns.structural.p2.case2;


import com.patterns.structural.p2.dependency.Movable;

public class AnotherCar extends MovableDecorator {

    public AnotherCar(Movable movable){
        super(movable);
    }

    public String getColor(){
        return super.getColor() + " is my color!";
    }
}
