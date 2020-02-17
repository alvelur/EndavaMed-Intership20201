package com.patterns.creational.p2.case2.factory;

import com.patterns.creational.p2.Cube;
import com.patterns.creational.p2.GeometricShape;

import java.util.Optional;

public class ThreeDShapeFactory extends AbstractFactory {

    public static final String CUBE = "cube";

    Optional<GeometricShape> getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase(CUBE)) {
            return Optional.of(new Cube());
        }
        return Optional.empty();
    }
}
