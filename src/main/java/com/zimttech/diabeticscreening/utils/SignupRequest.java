package com.zimttech.diabeticscreening.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class SignupRequest {
    private String username;
    private String email;
    private String password;
    private Set<String> role;
}
