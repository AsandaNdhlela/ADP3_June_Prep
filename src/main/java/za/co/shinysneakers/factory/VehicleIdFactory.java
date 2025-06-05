package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.VehicleId;

public class VehicleIdFactory {

    public static VehicleId createVehicleId(String make , String model) {
        if (make == null || make.isEmpty()) {
            return null;
        }
        if (model == null || model.isEmpty()) {
            return null;
        }
        return new VehicleId(make, model);
    }
}
