package com.patterns.creational.p2.case2.factory;

import com.patterns.creational.p2.GeometricShape;

import java.util.Optional;

public abstract class AbstractFactory {
    abstract Optional<GeometricShape> getShape(String shapeName);
}
