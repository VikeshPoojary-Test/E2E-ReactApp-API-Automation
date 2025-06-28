package com.vikesh.api.service;

import com.vikesh.api.BaseService;
import com.vikesh.api.model.request.usermanagement.PatchProfileRequest;
import com.vikesh.api.model.request.usermanagement.UpdateProfileRequest;
import io.restassured.response.Response;

public class UserManagement extends BaseService {

    private final static String PROFILE_BASE_PATH = "/api/users/profile";

    public Response getProfile(String token) {
        setToken(token);
        return getRequest(PROFILE_BASE_PATH);
    }

    public Response updateProfile(UpdateProfileRequest payload, String token) {
        setToken(token);
        return putRequest(PROFILE_BASE_PATH, payload);
    }

    public Response patchProfile(PatchProfileRequest payload, String token) {
        setToken(token);
        return patchRequest(PROFILE_BASE_PATH, payload);
    }

}
