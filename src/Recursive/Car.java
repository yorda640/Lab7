package Recursive;

import java.util.ArrayList;

class Car {
    private String model;
    private double fuelEfficiency;
    private ArrayList<Car> components;

    public Car(String model, double fuelEfficiency) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.components = new ArrayList<>();
    }

    public void addComponent(Car component) {
        components.add(component);
    }

    public double getTotalFuelEfficiency() {
        double totalFuelEfficiency = fuelEfficiency;

        // Recursively calculate fuel efficiency of components
        for (Car component : components) {
            totalFuelEfficiency += component.getTotalFuelEfficiency();
        }

        return totalFuelEfficiency;
    }
}

