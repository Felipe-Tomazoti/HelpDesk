package com.felipe.helpdesk.config.exceptions;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AuthenticationException extends StandardErrorConfig {

    public AuthenticationException(String path) {
        super(System.currentTimeMillis(), 401, "Unauthorized", "Token inválido ou não fornecido", path);
        System.out.println("ERRO NO AUTHENTICATION1: ");
    }

    public static void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("ERRO NO AUTHENTICATION1: ");
        AuthenticationException exception = new AuthenticationException(request.getRequestURI());
        exception.writeErrorResponse(response);
    }
}
