package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService extends IService<Customer, String> {

    List<Customer> getAll();
    // Additional methods specific to Employee can be added here

    // Custom query methods can be defined here if needed
    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByMobile(String mobile);
    Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
