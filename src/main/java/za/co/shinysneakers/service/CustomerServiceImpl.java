package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    // Implement the methods defined in ICustomerService here

    private static ICustomerService service;
    private CustomerRepository repository;

    @Autowired CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }
    // For example, you can use a repository to interact with the database

    @Override
    public Customer create(Customer customer) {
        // Implementation for creating a customer
        return this.repository.save(customer);
    }

    @Override
    public Customer read(String id) {
        // Implementation for reading a customer by ID
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        // Implementation for updating a customer
        return this.repository.save(customer);
    }

    @Override
    public boolean delete(String id) {
        // Implementation for deleting a customer by ID
            this.repository.deleteById(id);
            return true;
    }

    @Override
    public List<Customer> getAll() {
        // Implementation for getting all customers
        return this.repository.findAll();
    }
}
