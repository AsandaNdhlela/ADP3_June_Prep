package za.co.shinysneakers.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.core.annotation.Order;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HomeAddressFactoryTest {
    private static HomeAddress homeAddress = HomeAddressFactory.createHomeAddress("123 Main St", "Springfield", "IL", "Cape Town", "Western Cape","South Africa", "8001");
    private static HomeAddress homeAddressWithNullStreet = HomeAddressFactory.createHomeAddress(null, "Barrack", "City Centre", "Cape Town", "Western Cape","South Africa" ,"8001");

    @Test
    @Order(1)
    void createHomeAddress() {
        assertNotNull(homeAddress);
        System.out.println(homeAddress.toString());
    }
    @Test
    @Order(2)
    void createHomeAddressWithNullStreet() {
        assertNull(homeAddressWithNullStreet);
        System.out.println(homeAddressWithNullStreet);
    }
}