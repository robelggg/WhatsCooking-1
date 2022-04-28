package com.whatscooking.application.utilities.api.response;

public class RegisterResponse {

    private final String accountId;

    public RegisterResponse(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }
}

