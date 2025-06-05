package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer, String> {

    List<Customer> getAll();

    // Additional methods specific to Employee can be added here
}
