package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;

    public  double accelerate(double speed,double durationInHours){
        System.out.println(name + "accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        return traveledDistance;

    }
}

