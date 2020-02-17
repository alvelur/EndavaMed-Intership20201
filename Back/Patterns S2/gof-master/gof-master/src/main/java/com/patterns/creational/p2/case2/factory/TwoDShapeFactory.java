package com.patterns.creational.p2.case2.factory;

import com.patterns.creational.p2.GeometricShape;
import com.patterns.creational.p2.Circle;
import com.patterns.creational.p2.Line;

import java.util.Optional;

public class TwoDShapeFactory extends AbstractFactory {

    public static final String LINE = "line";
    public static final String CIRCLE = "circle";

    Optional<GeometricShape> getShape(String shapeName) {
        // what about multiple returns?
        if (shapeName.equalsIgnoreCase(LINE)) {
            return Optional.of(new Line());
        } else if (shapeName.equalsIgnoreCase(CIRCLE)) {
            return Optional.of(new Circle());
        }
        return Optional.empty();
    }
}