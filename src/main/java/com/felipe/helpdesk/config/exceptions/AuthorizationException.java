package com.felipe.helpdesk.config.exceptions;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AuthorizationException extends StandardErrorConfig {

    public AuthorizationException(String path) {
        super(System.currentTimeMillis(), 403, "Forbidden", "Você não tem permissão para acessar este recurso", path);
    }

    public static void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        AuthorizationException exception = new AuthorizationException(request.getRequestURI());
        exception.writeErrorResponse(response);
    }
}
