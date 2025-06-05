package za.co.shinysneakers.repository;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import za.co.shinysneakers.domain.Vehicle;
import za.co.shinysneakers.domain.VehicleId;

import java.util.Optional;
@Registered
public interface VehicleRepository extends JpaRepository<Vehicle, VehicleId> {
    // Custom query methods can be defined here if needed
    // For example, to find a vehicle by license plate:


    // Additional methods can be added as per requirements
}
