package com.api.personas.personasapi.config;

import java.time.LocalDateTime;
import java.util.List;

public class ApiError {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String path;
    private List<FieldError> fieldErrors;
    public ApiError(LocalDateTime timestamp, int status, String error, String path, List<FieldError> fieldErrors) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
        this.fieldErrors = fieldErrors;
    }

    public static class FieldError {
        private String field;
        private String message;
        public FieldError(String field, String message) {
            this.field = field;
            this.message = message;
        }
    }
}