package za.co.shinysneakers.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * VehicleId class represents a composite key for the Vehicle entity.
 * It consists of model and make as the composite key.
 */
public class VehicleId implements Serializable {

    private String make;
    private String model;

    public VehicleId() {
    }
    public VehicleId(String model, String make) {
        this.model = model;
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VehicleId vehicleId1 = (VehicleId) o;
        return Objects.equals(model, vehicleId1.model) && Objects.equals(make, vehicleId1.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, make);
    }
}
