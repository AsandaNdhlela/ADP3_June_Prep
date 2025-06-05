package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class CustomerFactory {

    public static Customer createCustomer(String firstName, String lastName, String email, String mobile) {
        String customerId = Helper.generateId();

        Long addressId = new Random().nextLong();
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(mobile)) {
            return null;
        }
        if (!Helper.isValidEmail(email)) {
            return null;
        }
        if( !Helper.isMobileNumberValid(mobile)) {
            return null;
        }

        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setMobile(mobile)
                .build();
    }

    public static Customer createCustomer(String firstName, String lastName, String email, String mobile, String streetNumber, String streetName, String suburb, String city, String province,String country, String postalCode) {
        String customerId = Helper.generateId();

        Long addressId = new Random().nextLong();

        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(mobile)
                || Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(suburb)
                || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(province) || Helper.isNullOrEmpty(postalCode)) {
            return null;
        }

        HomeAddress homeAddress = new HomeAddress.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setCountry(country)
                .setPostalCode(postalCode)
                .build();

        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setMobile(mobile)
                .setHomeAddress(homeAddress)
                .build();
    }


}
