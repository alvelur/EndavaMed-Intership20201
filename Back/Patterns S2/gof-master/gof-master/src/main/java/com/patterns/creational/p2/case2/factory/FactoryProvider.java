package com.patterns.creational.p2.case2.factory;

import java.util.Optional;

public class FactoryProvider {
    public static final String TWO_D = "two-d";
    public static final String THREE_D = "three-d";

    public static Optional<AbstractFactory> getFactory(String factoryType) {
        Optional<AbstractFactory> abstractFactory = Optional.empty();
        if (TWO_D.equalsIgnoreCase(factoryType)) {
            abstractFactory = Optional.of(new TwoDShapeFactory());
        } else if (THREE_D.equalsIgnoreCase(factoryType)) {
            abstractFactory = Optional.of(new ThreeDShapeFactory());
        }
        return abstractFactory;
    }
}
