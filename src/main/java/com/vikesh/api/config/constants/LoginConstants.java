package com.vikesh.api.config.constants;

public enum LoginConstants {
    USERNAME("username"),
    PASSWORD("password");

    private final String value;

    private LoginConstants(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
