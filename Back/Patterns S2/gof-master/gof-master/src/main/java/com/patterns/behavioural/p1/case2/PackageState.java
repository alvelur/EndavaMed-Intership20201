package com.patterns.behavioural.p1.case2;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
