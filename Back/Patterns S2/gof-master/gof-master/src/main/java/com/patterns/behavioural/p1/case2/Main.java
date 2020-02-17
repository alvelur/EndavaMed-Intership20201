package com.patterns.behavioural.p1.case2;

public class Main {
    public static void main(String[] arg){
        Package pkg = new Package();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
        pkg.nextState();
        pkg.nextState();
        pkg.printStatus();
    }
}
