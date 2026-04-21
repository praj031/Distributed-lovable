package com.project.loveable.account_service.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
