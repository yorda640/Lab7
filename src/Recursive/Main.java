package Recursive;

public class Main {
    public static void main(String[] args) {
        // Create instances of planets and moons
        Planet earth = new Planet("Earth");
        Planet moon1 = new Planet("Moon 1");
        Planet moon2 = new Planet("Moon 2");

        earth.addMoon(moon1);
        earth.addMoon(moon2);

        Planet mars = new Planet("Mars");
        Planet moon3 = new Planet("Moon 3");

        mars.addMoon(moon3);

        // Test the getTotalMoons method
        System.out.println("Total moons for Earth: " + earth.getTotalMoons());  // Output: 3
        System.out.println("Total moons for Mars: " + mars.getTotalMoons());    // Output: 1
    }
}
