package model;

import java.util.Objects;

public class CheckoutData {
    private String firstName;
    private String lastName;
    private String zipCode;

    public String getFirstName() {
        return firstName;
    }

    public CheckoutData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CheckoutData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public CheckoutData setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public String toString() {
        return "CheckoutData{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zioCode='" + zipCode + '\'' +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, zipCode);
    }


}
