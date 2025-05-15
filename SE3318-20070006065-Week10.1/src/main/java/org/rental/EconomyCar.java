package org.rental;

/**
 * Economy car with optional hybrid feature.
 */
public class EconomyCar extends VehicleAbstract {
    private boolean isHybrid;
    private static final double BASE_PRICE = 50.0;
    private static final double HYBRID_PRICE = 10.0;

    public EconomyCar(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateDailyPrice() {
        return BASE_PRICE + (isHybrid ? HYBRID_PRICE : 0);
    }
}
