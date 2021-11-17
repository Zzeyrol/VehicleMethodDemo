package com.company;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пройдёт путь, равный " + value + " км. ");
    }
}
