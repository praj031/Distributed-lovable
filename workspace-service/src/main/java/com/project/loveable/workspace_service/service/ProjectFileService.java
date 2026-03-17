package com.project.loveable.workspace_service.service;


import com.project.loveable.common_lib.dto.FileTreeDto;

public interface ProjectFileService {
    FileTreeDto getFileTree(Long projectId);

    String getFileContent(Long projectId, String path);

    void saveFile(Long projectId, String filePath, String fileContent);
}
