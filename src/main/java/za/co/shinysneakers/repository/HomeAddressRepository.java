package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.HomeAddress;

import java.util.Optional;

@Repository
public interface HomeAddressRepository extends JpaRepository<HomeAddress, Long> {
    // Additional query methods can be defined here if needed
    // For example, to find a home address by street name or city:
   Optional <HomeAddress> findByStreetName(String streetName);
    Optional <HomeAddress> findByCity(String city);
}
