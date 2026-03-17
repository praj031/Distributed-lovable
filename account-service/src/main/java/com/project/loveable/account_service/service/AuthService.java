package com.project.loveable.account_service.service;


import com.project.loveable.account_service.dto.auth.AuthResponse;
import com.project.loveable.account_service.dto.auth.LoginRequest;
import com.project.loveable.account_service.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
