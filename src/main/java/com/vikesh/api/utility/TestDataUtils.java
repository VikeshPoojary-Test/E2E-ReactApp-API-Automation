package com.vikesh.api.utility;

import com.github.javafaker.Faker;
import com.vikesh.api.model.request.authentication.LoginRequest;
import com.vikesh.api.model.request.authentication.SignupRequest;

public class TestDataUtils {
    static Faker faker = new Faker();

    public static LoginRequest getAuthenticationData() {
        LoginRequest loginData = new LoginRequest();
        loginData.setUsername("Vikesh");
        loginData.setPassword("Vikesh");

        return loginData;
    }

    public static SignupRequest getSignupData() {
        SignupRequest signupData = new SignupRequest();

        signupData.setUsername(faker.name().username());
        signupData.setPassword(faker.internet().password());
        signupData.setEmail(faker.internet().emailAddress());
        signupData.setFirstName(faker.name().firstName());
        signupData.setLastName(faker.name().lastName());
        signupData.setMobileNumber(faker.number().digits(10));

        return signupData;
    }

}
