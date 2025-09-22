// src/main/java/com/garvit/roomiefinder/dto/SendMessageRequest.java
package com.garvit.roomiefinder.dto;

import lombok.Data;

@Data
public class SendMessageRequest {
    private Long recipientId;
    private String content;
}
