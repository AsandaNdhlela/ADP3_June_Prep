package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class HomeAddressFactory {
    public static HomeAddress createHomeAddress(String streetNumber, String streetName, String suburb, String city, String province,String country, String postalCode){
        Long addressId = new Random().nextLong();

        if(Helper.isValidPostalCode(postalCode) || Helper.isValidStreetNumber(streetNumber) || Helper.isValidProvince(province)){
            return null;
        }

        return new HomeAddress.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setCountry(country)
                .setPostalCode(postalCode)
                .build();
    }
}
