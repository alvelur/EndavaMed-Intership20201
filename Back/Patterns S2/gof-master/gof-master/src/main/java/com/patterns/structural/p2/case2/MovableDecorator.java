package com.patterns.structural.p2.case2;

import com.patterns.structural.p2.dependency.Movable;

public abstract class MovableDecorator implements Movable {
    Movable movable;

    public MovableDecorator(Movable movable){
        this.movable = movable;
    }
    public String getColor(){
        return movable.getColor();
    }
}
