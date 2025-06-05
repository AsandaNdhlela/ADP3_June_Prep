package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Vehicle;
import za.co.shinysneakers.domain.VehicleId;

public class VehicleFactory {
    public static Vehicle createVehicle(String make, String model, String year, String color, String licensePlate) {
        if (make == null || make.isEmpty()) {
            return null;
        }
        if (model == null || model.isEmpty()) {
            return null;
        }
        if (year == null || year.isEmpty()) {
            return null;
        }
        if (color == null || color.isEmpty()) {
            return null;
        }
        if (licensePlate == null || licensePlate.isEmpty()) {
            return null;
        }
        return new Vehicle.Builder()
                        .setMake(make)
                        .setModel(model)
                        .setYear(year)
                        .setColor(color)
                        .setLicensePlate(licensePlate)
                        .build();
    }

    public static Vehicle createVehicle(String vehicleId, String make, String model, String year, String color, String licensePlate) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            return null;
        }
        if (make == null || make.isEmpty()) {
            return null;
        }
        if (model == null || model.isEmpty()) {
            return null;
        }
        if (year == null || year.isEmpty()) {
            return null;
        }
        if (color == null || color.isEmpty()) {
            return null;
        }
        if (licensePlate == null || licensePlate.isEmpty()) {
            return null;
        }

        return new Vehicle.Builder()
                        .setVehicleId(vehicleId)
                        .setMake(make)
                        .setModel(model)
                        .setYear(year)
                        .setColor(color)
                        .setLicensePlate(licensePlate)
                        .build();
    }

}
