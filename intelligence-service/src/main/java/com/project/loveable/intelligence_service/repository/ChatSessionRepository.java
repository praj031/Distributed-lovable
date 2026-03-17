package com.project.loveable.intelligence_service.repository;

import com.project.loveable.intelligence_service.entity.ChatSession;
import com.project.loveable.intelligence_service.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
