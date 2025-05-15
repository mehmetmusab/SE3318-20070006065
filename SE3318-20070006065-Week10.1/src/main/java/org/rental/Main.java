package org.rental;

/**
 * Main class to demonstrate car rental system.
 */
public class Main {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar("BMW", "7 Series", "34ABC123", true, true);
        EconomyCar economyCar = new EconomyCar("Toyota", "Yaris", "35XYZ789", true);

        RentalRecord record1 = new RentalRecord(luxuryCar, "Alice", 3);
        RentalRecord record2 = new RentalRecord(economyCar, "Bob", 5);

        System.out.println(record1.getSummary());
        System.out.println(record2.getSummary());
    }
}
