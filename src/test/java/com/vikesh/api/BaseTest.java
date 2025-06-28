package com.vikesh.api;

import com.vikesh.api.model.response.authentication.LoginResponse;
import com.vikesh.api.utility.GenerateToken;
import com.vikesh.api.utility.Listener;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listener.class)
public class BaseTest extends BaseService {

    protected static LoginResponse loginResponse;

    @BeforeTest
    public void beforeTest() {
        loginResponse = GenerateToken.getToken();
    }

}
