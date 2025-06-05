package za.co.shinysneakers.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceImplTest {
    // Assuming CustomerServiceImpl is the service class to be tested
    // ,and it has methods for create, read, update, delete, and getAll operations.
    // You would typically autowire the service here, but for this example, we will just define the test methods.
    @Autowired
    private CustomerServiceImpl customerService;
    private static Customer customer = new Customer.Builder()
            .setFirstName("Alice")
            .setLastName("Julian")
            .setEmail("alicej@gmail.com")
            .setMobile("0810392211")
            .build();

    @Test
    void a_create() {
        // Assuming the create method takes a Customer object and returns the created Customer object
        Customer createdCustomer = customerService.create(customer);
        assertNotNull(createdCustomer);
        assertEquals(customer.getCustomerId(), createdCustomer.getCustomerId());
        System.out.println("Created Customer: " + createdCustomer);
    }

    @Test
    void b_read() {
        // Assuming the read method takes a customer ID and returns the Customer object
        Customer readCustomer = customerService.read(customer.getCustomerId());
        assertNotNull(readCustomer);
        assertEquals(customer.getCustomerId(), readCustomer.getCustomerId());
        System.out.println("Read Customer: " + readCustomer);
    }

    @Test
    void c_update() {
        // Assuming the update method takes a Customer object and returns the updated Customer
        Customer updatedCustomer = new Customer.Builder()
                .copy(customer)
                .setFirstName("Bob")
                .setLastName("Smith")
                .build();
        Customer result = customerService.update(updatedCustomer);
        assertNotNull(result);
        assertEquals("Bob", result.getFirstName());
        System.out.println("Updated Customer: " + result);
    }

    @Test
    @Disabled
    void e_delete() {
        // Assuming the delete method returns a boolean indicating success or failure
        boolean deleted = customerService.delete(customer.getCustomerId());
        assertTrue(deleted);
        System.out.println("Deleted Customer with ID: " + customer.getCustomerId());
    }

    @Test
    void d_getAll() {
        // Assuming getAll returns a list of customers
        System.out.println("All Customers: ");
        for (Customer customer : customerService.getAll()) {
            System.out.println(customer);
        }
    }
}