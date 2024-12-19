package com.felipe.helpdesk.config.exceptions;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class StandardErrorConfig {

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardErrorConfig(Long timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void writeErrorResponse(HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setStatus(this.getStatus());
        response.getWriter().write("{"
                + "\"timestamp\": " + this.getTimestamp() + ","
                + "\"status\": " + this.getStatus() + ","
                + "\"error\": \"" + this.getError() + "\","
                + "\"message\": \"" + this.getMessage() + "\","
                + "\"path\": \"" + this.getPath() + "\""
                + "}");
    }
}
