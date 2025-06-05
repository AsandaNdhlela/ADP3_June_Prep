package za.co.shinysneakers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.service.CustomerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private static CustomerServiceImpl service;
    // Constructor injection for the service

    @Autowired public CustomerController(CustomerServiceImpl service) {
        CustomerController.service = service;
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.create( customer);
    }
    @GetMapping("/read/{id}")
    public Customer readCustomer(@PathVariable String id) {
        return service.read(id);
    }
    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return service.update(customer);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteCustomer(@PathVariable String id) {
        return service.delete(id);
    }
    @GetMapping("/getAll")
    public List<Customer> getAllCustomers() {
        return service.getAll();
    }
}
