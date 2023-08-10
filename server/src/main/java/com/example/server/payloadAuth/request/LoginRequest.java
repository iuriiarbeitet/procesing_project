package com.example.server.payloadAuth.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "Username can not be empty")
    private String username;

    @NotEmpty(message = "Password can not be empty")
    private String password;

}
