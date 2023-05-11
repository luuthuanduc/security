package com.aimatrix.security.auth;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;

}
