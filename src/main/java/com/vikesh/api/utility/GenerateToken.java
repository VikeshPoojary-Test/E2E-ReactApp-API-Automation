package com.vikesh.api.utility;

import com.vikesh.api.model.request.authentication.LoginRequest;
import com.vikesh.api.model.response.authentication.LoginResponse;
import com.vikesh.api.service.Authentication;

public class GenerateToken {
    public static LoginResponse getToken() {
        Authentication authentication = new Authentication();
        return authentication.login(new LoginRequest("Vikesh", "testingdccnt@24"))
                .as(LoginResponse.class);
    }
}
