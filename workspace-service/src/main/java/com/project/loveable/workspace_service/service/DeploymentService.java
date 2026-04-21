package com.project.loveable.workspace_service.service;

import com.project.loveable.workspace_service.dto.project.DeployResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

public interface DeploymentService {
    @Nullable DeployResponse deploy(Long projectId);
}
