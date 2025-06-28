package com.vikesh.api.service;

import com.vikesh.api.BaseService;
import com.vikesh.api.model.request.authentication.LoginRequest;
import com.vikesh.api.model.request.authentication.SignupRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class Authentication extends BaseService {
    private final static String LOGIN_BASE_PATH = "/api/auth/login";
    private final static String SIGNUP_BASE_PATH = "/api/auth/signup";
    private final static String FORGOT_PASSWORD_BASE_PATH = "/api/auth/forgot-password";

    /**
     * {@code @description} Logs a user into the application.
     * The payload should contain the username and password of the user.
     * @param payload the payload that contains the username and password.
     * @return the response from the server.
     */
    public Response login(LoginRequest payload) {
        return postRequest(LOGIN_BASE_PATH, payload);
    }

    /**
     * {@code @description} Signs up a user to the application.
     * The payload should contain the necessary user information
     * @param payload the payload that contains the body.
     * @return the response from the server.
     **/
    public Response signUp(SignupRequest payload) {
        return postRequest(SIGNUP_BASE_PATH, payload);
    }

    /**
     * {@code @description} Sends a forgot password request to the server for the given email.
     *
     * @param payload the email address for which the forgot password request is to be sent
     *                <p>
     *                We are not writing POJO class for the body as it contains only one parameter
     * @return
     */
    public Response forgotPassword(String payload) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("email", payload);
        return postRequest(FORGOT_PASSWORD_BASE_PATH, map);
    }
}
