package com.project.loveable.workspace_service.mapper;

import com.project.loveable.common_lib.dto.FileNode;
import com.project.loveable.workspace_service.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
