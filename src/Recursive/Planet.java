package Recursive;

import java.util.ArrayList;

public class Planet {
    private String name;
    private ArrayList<Planet> moons;

    public Planet(String name) {
        this.name = name;
        this.moons = new ArrayList<>();
    }

    public void addMoon(Planet moon) {
        this.moons.add(moon);
    }

    public int getTotalMoons() {
        int count = this.moons.size(); // Count the immediate moons of the current planet

        // Recursively count moons of each moon
        for (Planet moon : this.moons) {
            count += moon.getTotalMoons();
        }

        return count;
    }
}
