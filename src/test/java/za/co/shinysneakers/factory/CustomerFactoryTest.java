package za.co.shinysneakers.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerFactoryTest {

    private static Customer customer = CustomerFactory.createCustomer("John", "Doe", "johndoe@gmail", "1234567890");
    private static Customer customerWithNullName = CustomerFactory.createCustomer(null, "Boww", "nullboww@gmail.com", "0983822911");
    private static Customer customerWithInvalidEmail = CustomerFactory.createCustomer("Rosse", "Meek", "rossemeek.mail", "5635678090");
    private static Customer customerWithInvalidMobile = CustomerFactory.createCustomer("Jenet", "Banker", "jenetbanker@gmail.com", "12345");

    /**
     * Test cases for CustomerFactory
     * 1. Create a customer with valid details
     * 2. Create a customer with null name
     * 3. Create a customer with invalid email
     * 4. Create a customer with invalid mobile number
     */
    @Test
    void a_createCustomer() {
        assertNotNull(customer);
        System.out.println(customer.toString());
    }
    @Test
    void b_createCustomerWithNullName(){
        assertNotNull(customerWithNullName);
        System.out.println(customerWithNullName.toString());
    }
    @Test
    void c_createCustomerThatFails(){
        assertNotNull(customerWithInvalidEmail);
        System.out.println(customerWithInvalidEmail.toString());
    }
    @Test
    void d_createCustomerWithInvalidMobile(){
        assertNotNull(customerWithInvalidMobile);
        System.out.println(customerWithInvalidMobile.toString());
    }
}