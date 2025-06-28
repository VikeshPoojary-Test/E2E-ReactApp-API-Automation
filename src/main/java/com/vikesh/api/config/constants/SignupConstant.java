package com.vikesh.api.config.constants;

import lombok.Getter;

@Getter
public enum SignupConstant {

    USERNAME("username"),
    PASSWORD("password"),
    EMAIL("email"),
    FIRST_NAME("firstName"),
    LAST_NAME("lastName"),
    MOBILE_NUMBER("mobileNumber");

    private final String value;

    SignupConstant(String value){
        this.value = value;
    }

}
