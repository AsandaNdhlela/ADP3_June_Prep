package za.co.shinysneakers.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerControllerTest {

    // This is a test class for the CustomerController
    private static Customer customer;

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String BASE_URL = "http://localhost:8080/customer"; // Adjust the port if necessary

    @BeforeAll
    public static void setUp() {
        // Initialize the customer object with test data
        customer = new CustomerFactory().createCustomer(
                "Asanda",
                "Ndhlela",
                "asandan@gmail.com",
                "0835922632");
    }

    @Test
    void createCustomer() {
        String url = BASE_URL + "/create";
        Customer response = this.restTemplate.postForObject(url, customer, Customer.class);
        assertNotNull(response);
        assert response.getFirstName().equals(customer.getFirstName());
        assert response.getLastName().equals(customer.getLastName());
        assert response.getEmail().equals(customer.getEmail());
        assert response.getMobile().equals(customer.getMobile());
        System.out.println("Created Customer: " + response);
    }

    @Test
    void readCustomer() {
        String url = BASE_URL + "/read/" + customer.getCustomerId();
        Customer response = this.restTemplate.getForObject(url, Customer.class);
        assertNotNull(response);
        assert response.getCustomerId().equals(customer.getCustomerId());
        assert response.getFirstName().equals(customer.getFirstName());
        assert response.getLastName().equals(customer.getLastName());
        System.out.println("Read Customer: " + response);
    }

    @Test
    void updateCustomer() {
        String url = BASE_URL + "/update";
        Customer newFirstName = new Customer.Builder().setFirstName("NewFirstName").build();
        Customer updatedCustomer = new Customer.Builder().
                copy(customer).
                setFirstName(newFirstName.getFirstName()).
                build();
        this.restTemplate.put(url, updatedCustomer);

        Customer response = this.restTemplate.getForObject(url + "/read/" + updatedCustomer.getCustomerId(), Customer.class);
        assertNotNull(response);
        assertEquals( newFirstName.getFirstName(), response.getFirstName());
        System.out.println("Updated Customer: " + response);
    }

    @Test
    void deleteCustomer() {
        String url = BASE_URL + "/delete/" + customer.getCustomerId();
        this.restTemplate.delete(url);
        Customer response = this.restTemplate.getForObject(url, Customer.class);
        assertNotNull(response);
        assertEquals(null, response); // Assuming the service returns null for deleted customers
        System.out.println("Deleted Customer: " + customer.getCustomerId());
    }

    @Test
    void getAllCustomers() {
        String url = BASE_URL + "/getAll";
        Customer[] customers = this.restTemplate.getForObject(url, Customer[].class);
        assertNotNull(customers);
        assert customers.length > 0; // Assuming there are customers in the database
        System.out.println("All Customers: ");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}