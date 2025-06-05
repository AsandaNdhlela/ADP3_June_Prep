package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

//implementing a Vehicle entity with composite key using IdClass
@Entity
@IdClass(VehicleId.class)
public class Vehicle {
    @Id
    private String vehicleId;
    @Id
    private String make;
    private String model;
    private String year;
    private String color;
    private String licensePlate;

    protected Vehicle() {
    }

    private Vehicle(Builder builder) {
        this.vehicleId = builder.vehicleId;
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.licensePlate = builder.licensePlate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public static class Builder {
        private String vehicleId;
        private String make;
        private String model;
        private String year;
        private String color;
        private String licensePlate;

        public Builder setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Builder copy(Vehicle vehicle) {
            this.vehicleId = vehicle.vehicleId;
            this.make = vehicle.make;
            this.model = vehicle.model;
            this.year = vehicle.year;
            this.color = vehicle.color;
            this.licensePlate = vehicle.licensePlate;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
