package com.patterns.structural.p1.case2;

import com.patterns.structural.p1.dependency.Movable;

public class MovableAdapterImplementation implements MovableAdapter {
    private Movable movable;

    public MovableAdapterImplementation(Movable movable){
        this.movable = movable;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(movable.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1000;
    }
}
