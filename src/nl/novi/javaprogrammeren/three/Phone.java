package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneNumber(String countryCode) {
        return countryCode+this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInternationalPhoneNumber() {
        String phoneNumber = "+31";
        return phoneNumber;
    }
}
