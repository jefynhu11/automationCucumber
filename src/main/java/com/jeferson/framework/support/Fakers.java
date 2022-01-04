package com.jeferson.framework.support;

import com.github.javafaker.Faker;

public class Fakers {
    private Faker faker = new Faker();
    private String email, emailReference, password;
    private String firstName, lastName;
    private String company, address1, address2, city, postalCode;
    private String phone, mobilePhone;

    public Fakers() {
    }

    public String getEmail() {
        email = faker.internet().emailAddress();
        return email;
    }

    public String getFirstName() {
        firstName = faker.name().firstName();
        return firstName;
    }

    public String getLastName() {
        lastName = faker.name().lastName();
        return lastName;
    }

    public String getPassword() {
        password = faker.internet().password();
        return password;
    }

    public String getAddress1() {
        address1 = faker.address().streetAddress();
        return address1;
    }

    public String getCity() {
        city = faker.address().city();
        return city;
    }

    public String getPostalCode() {
        postalCode = faker.address().zipCode();
        return postalCode;
    }

    public String getMobilePhone() {
        mobilePhone = faker.phoneNumber().phoneNumber();
        return mobilePhone;
    }
}
