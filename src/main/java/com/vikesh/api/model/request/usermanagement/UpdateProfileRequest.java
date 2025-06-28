package com.vikesh.api.model.request.usermanagement;

public class UpdateProfileRequest {
    private  String firstName;
    private String lastName;
    private String email ;
    private String mobileNumber;

    public UpdateProfileRequest() {}

    public UpdateProfileRequest(String firstName, String lastName, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static class UpdateProfileRequestBuilder{
        String firstName;
        String lastName;
        String email ;
        String mobileNumber;

        public UpdateProfileRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UpdateProfileRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UpdateProfileRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UpdateProfileRequestBuilder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UpdateProfileRequest build(){
            return new UpdateProfileRequest(firstName, lastName, email, mobileNumber);
        }
    }
}
