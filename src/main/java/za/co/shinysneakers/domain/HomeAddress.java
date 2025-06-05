package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HomeAddress {
    @Id
    private Long addressId;
    private String streetNumber;
    private String streetName;
    private String suburb;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    protected HomeAddress() {
    }

    protected HomeAddress(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
        this.country = builder.country;
    }

    public Long getAddressId() {
        return addressId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "addressId=" + addressId +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static class Builder {
        private Long addressId;
        private String streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private String country;
        private String postalCode;

        public Builder setAddressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(HomeAddress homeAddress) {
            this.addressId = homeAddress.addressId;
            this.streetNumber = homeAddress.streetNumber;
            this.streetName = homeAddress.streetName;
            this.suburb = homeAddress.suburb;
            this.city = homeAddress.city;
            this.province = homeAddress.province;
            this.country = homeAddress.country;
            this.postalCode = homeAddress.postalCode;
            return this;
        }

        public HomeAddress build() {
            return new HomeAddress(this);
        }
    }
}

