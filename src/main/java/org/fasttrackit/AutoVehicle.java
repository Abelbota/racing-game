package org.fasttrackit;
// inheritance or "is-a" relationship
public class AutoVehicle extends Vehicle {
    Engine engine;
    boolean running;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
