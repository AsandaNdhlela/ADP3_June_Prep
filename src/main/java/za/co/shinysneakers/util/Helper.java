package za.co.shinysneakers.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {

    public static String generateId() {
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            int randomDigit = (int) (Math.random() * 100000);
            id.append(randomDigit);
        }
        return id.toString();
    }

    public static boolean isNullOrEmpty(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            return true;
        }
        return false;
    }
    public static boolean isMobileNumberValid(String mobile) {
        if (mobile == null || mobile.length() != 10) {
            return false;
        }
        // Assuming a valid mobile number is 10 digits long
        return true;
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();

        if (validator.isValid(email)|| email.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isValidPostalCode(String postalCode) {
        // Assuming a valid postal code is a 4-digit number
        if (postalCode == null || postalCode.length() != 4) {
            return false;
        }
        return true;
    }
    public static boolean isValidStreetNumber(String streetNumber) {
        // Assuming a valid street number is a positive integer
        return isValidProvince(streetNumber);

    }
    public static boolean isValidProvince(String province) {
        // Assuming a valid province is not null or empty
        if (province == null || province.isEmpty()) {
            return false;
        }
        return true;
    }
}
