package com.project.loveable.api_gateway.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.List;

public record ApiError(
        HttpStatus httpStatus,
        String message,
        Instant timestamp,
        @JsonInclude(JsonInclude.Include.NON_NULL) List<ApiFieldError> errors
) {
    //Constructor to validate error (with field level details)
    public ApiError(HttpStatus code, List<ApiFieldError> errors) {
        this(code, "Validation failed", Instant.now(), errors);
    }
    //Constructor for simple error (no field details)
    public ApiError(HttpStatus code, String message) {
        this(code, message, Instant.now(), null);
    }
    //Optional: Constructor to for simple error with timestamp(if needed elsewhere)
    public ApiError(HttpStatus code, String message, Instant timestamp) {
        this(code, message, timestamp, null);
    }
}

record ApiFieldError(String field, String message) {}