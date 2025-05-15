package org.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmokeTest {

    @Test
    public void testLuxuryCarPricing() {
        LuxuryCar car = new LuxuryCar("Audi", "A8", "06CAR001", true, false);
        assertEquals(120.0, car.calculateDailyPrice());
    }

    @Test
    public void testRentalTotal() {
        EconomyCar car = new EconomyCar("Honda", "Fit", "06EKO123", true);
        RentalRecord record = new RentalRecord(car, "TestUser", 2);
        assertEquals(120.0, record.calculateTotalPrice());
    }
}
