package com.patterns.creational.p2.case2.factory;

import com.patterns.creational.p2.GeometricShape;

import java.util.Optional;

public class Main {

    public static void main(String[] arg){
        Optional<AbstractFactory> factory = FactoryProvider.getFactory(arg[0]);
        if(factory.isPresent()){
            Optional<GeometricShape> shape = factory.get().getShape(arg[1]);
            if(shape.isPresent()){
                shape.get().draw();
            }
        }

        //System.out.println(Calendar.getInstance());

    }
}
