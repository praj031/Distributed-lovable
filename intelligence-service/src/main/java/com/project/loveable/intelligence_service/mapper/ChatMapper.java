package com.project.loveable.intelligence_service.mapper;

import com.project.loveable.intelligence_service.dto.chat.ChatResponse;
import com.project.loveable.intelligence_service.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
