package com.whatscooking.application.utilities.api.response;

import com.google.gson.annotations.SerializedName;

public class ErrorResponse {

    @SerializedName("message")
    private String message;

    public String getMessage() {
        return this.message;
    }
}
