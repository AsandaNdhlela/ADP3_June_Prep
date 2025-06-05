package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.Customer;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // Custom query methods can be defined here if needed
    // For example, to find a customer by email:
    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByMobile(String mobile);

    Customer findByFirstName(String firstName);


}
