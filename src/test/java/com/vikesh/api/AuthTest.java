package com.vikesh.api;

import com.vikesh.api.model.request.authentication.LoginRequest;
import com.vikesh.api.model.request.authentication.SignupRequest;
import com.vikesh.api.model.response.authentication.LoginResponse;
import com.vikesh.api.service.Authentication;

import com.vikesh.api.utility.TestDataUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class AuthTest extends BaseTest {

    @Test(description = "Sign up to the application")
    public void SignUpToApp() {
//        RestAssured.baseURI = "http://64.227.160.186:8080";
//        String response = given().header("Content-Type", "application/json")
//                .header("accept", "application/json")
//                .body("{\n" +
//                        "  \"username\": \"Vikesh\",\n" +
//                        "  \"password\": \"testingdccnt@24\"\n" +
//                        "}")
//                .when().post("/api/auth/login")
//                .then().statusCode(200).extract().asPrettyString();
//        System.out.println(response);

        Authentication authentication = new Authentication();
        SignupRequest signupData = TestDataUtils.getSignupData();

//
        SignupRequest signupRequest = new SignupRequest.SignupRequestBuilder()
                .username(signupData.getUsername())
                .password(signupData.getPassword())
                .email(signupData.getEmail())
                .firstName(signupData.getFirstName())
                .lastName(signupData.getLastName())
                .mobileNumber(signupData.getMobileNumber()).build();

        Response signupResponse = authentication.signUp(signupRequest);

    }

    @Test(description = "Login to the application")
    public void LoginToApp() {
        Authentication authentication = new Authentication();

        LoginRequest loginRequest = new LoginRequest("ikesh", "testingdccnt@24");
        LoginResponse loginResponse = new LoginResponse();

        loginRequest.setPassword("testingdccnt@1241");
        loginRequest.setUsername("Test190120251");

        Response loginRes = authentication.login(loginRequest);
        loginRes.as(LoginResponse.class);

    }

    @Test(description = "Forgot Password")
    public void forgotPassword() {
        Authentication authentication = new Authentication();
        Response response = authentication.forgotPassword("Vikes754@gmail.com");
    }
}
