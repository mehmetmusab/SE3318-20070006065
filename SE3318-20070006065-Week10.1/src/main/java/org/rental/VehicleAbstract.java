package org.rental;

/**
 * Abstract class representing a generic vehicle.
 */
public abstract class VehicleAbstract {
    protected String brand;
    protected String model;
    protected String licensePlate;

    public VehicleAbstract(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public abstract double calculateDailyPrice();

    public String getLicensePlate() {
        return licensePlate;
    }
}
