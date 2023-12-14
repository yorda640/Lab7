package Recursive;

public class Mainn {
    public static void main(String[] args) {
        // Create instances of cars and components
        Car sedan = new Car("Sedan", 30.0);
        Car suv = new Car("SUV", 25.0);

        Car hatchback = new Car("Hatchback", 28.0);
        Car compactSUV = new Car("Compact SUV", 22.0);

        sedan.addComponent(hatchback);
        suv.addComponent(compactSUV);

        // Test the getTotalFuelEfficiency method
        System.out.println("Total fuel efficiency for Sedan: " + sedan.getTotalFuelEfficiency());  // Output: 58.0
        System.out.println("Total fuel efficiency for SUV: " + suv.getTotalFuelEfficiency());      // Output: 47.0
    }
}

