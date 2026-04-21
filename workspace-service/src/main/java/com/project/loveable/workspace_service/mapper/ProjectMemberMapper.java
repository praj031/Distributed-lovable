package com.project.loveable.workspace_service.mapper;

import com.project.loveable.workspace_service.dto.member.MemberResponse;
import com.project.loveable.workspace_service.entity.ProjectMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id.userId")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
