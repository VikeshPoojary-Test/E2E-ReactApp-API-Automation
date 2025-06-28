package com.vikesh.api;

import com.vikesh.api.utility.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    private final static String BASE_URL = "http://64.227.160.186:8080";
    private final RequestSpecification requestSpecification;

    public BaseService() {
        requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    static {
        RestAssured.filters(new LoggingFilter());
    }

    protected void setToken(String token) {
        requestSpecification.header("Authorization", "Bearer " + token);
    }

    protected Response postRequest(String endpoint, Object payload) {
        return requestSpecification.header("Content-Type", "application/json")
                .body(payload).when().post(endpoint);
    }

    protected Response getRequest(String endpoint) {
        return requestSpecification.get(endpoint);
    }

    protected Response putRequest(String endpoint, Object payload) {
        return requestSpecification.header("Content-Type", "application/json")
                .body(payload).when().put(endpoint);
    }

    protected Response patchRequest(String endpoint, Object payload) {
        return requestSpecification.header("Content-Type", "application/json")
                .body(payload).when().patch(endpoint);
    }

}
