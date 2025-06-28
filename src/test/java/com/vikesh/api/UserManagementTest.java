package com.vikesh.api;

import com.vikesh.api.model.request.usermanagement.UpdateProfileRequest;
import com.vikesh.api.model.response.authentication.LoginResponse;
import com.vikesh.api.service.UserManagement;
import com.vikesh.api.utility.GenerateToken;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UserManagementTest extends BaseTest {
    @Test(description = "Get User Profile")
    public void getUserProfile() {

        UserManagement userManagement = new UserManagement();
        Response profile = userManagement.getProfile(loginResponse.getToken());
    }

    @Test(description = "Update User Profile")
    public void updateUserProfile() {


        UserManagement userManagement = new UserManagement();

//        UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest.UpdateProfileRequestBuilder()
//                .firstName("Vikesh")
//                .lastName("Gupta")
//                .email("v6z5K@example.com")
//                .mobileNumber("1234567890").build();

        UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest();
        updateProfileRequest.setEmail("v16z5TESTK@example.com");
        updateProfileRequest.setFirstName("Vikesh");
        updateProfileRequest.setLastName("SD");
        updateProfileRequest.setMobileNumber("1234567890");

        Response updateProfileresponse = userManagement.updateProfile(updateProfileRequest, loginResponse.getToken());

    }

}
