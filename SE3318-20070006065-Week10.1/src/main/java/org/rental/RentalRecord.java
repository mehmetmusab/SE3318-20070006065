package org.rental;

/**
 * Record for vehicle rental.
 */
public class RentalRecord {
    private VehicleAbstract vehicle;
    private String customerName;
    private int rentalDays;

    public RentalRecord(VehicleAbstract vehicle, String customerName, int rentalDays) {
        this.vehicle = vehicle;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalPrice() {
        return vehicle.calculateDailyPrice() * rentalDays;
    }

    public String getSummary() {
        return "Customer: " + customerName + ", Vehicle: " + vehicle.getLicensePlate() +
               ", Days: " + rentalDays + ", Total: $" + calculateTotalPrice();
    }
}
