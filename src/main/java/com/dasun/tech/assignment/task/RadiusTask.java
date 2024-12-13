package com.dasun.tech.assignment.task;

public class RadiusTask {

    static final double PI = Math.PI;
    static double Area(double r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
        double r = 5;
        System.out.println("Area of the circle is :" + Area(r));
    }
}
