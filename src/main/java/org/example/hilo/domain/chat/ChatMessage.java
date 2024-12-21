package org.example.hilo.domain.chat;

import java.time.LocalDateTime;

public class ChatMessage {
  private long chatMessageId;
  private String content;
  private String ImageUrl;
  private LocalDateTime createAt;
  private long senderId;
  private SenderType senderType;
}
