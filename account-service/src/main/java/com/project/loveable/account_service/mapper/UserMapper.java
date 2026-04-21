package com.project.loveable.account_service.mapper;


import com.project.loveable.account_service.dto.auth.SignupRequest;
import com.project.loveable.account_service.dto.auth.UserProfileResponse;
import com.project.loveable.account_service.entity.User;
import com.project.loveable.common_lib.dto.UserDto;
import com.project.loveable.common_lib.security.JwtUserPrincipal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    @Mapping(source = "userId", target = "id")
    UserProfileResponse toUserProfileResponse(JwtUserPrincipal user);

    UserDto toUserDto(User user);

}
