package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("Accelerated as UFO");
        System.out.println(getName() + "accelerated with" + speed + "km/h for" + durationInHours + "hours.");

        double traveledDistance = 2 * speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance);

        return traveledDistance;

    }
}

