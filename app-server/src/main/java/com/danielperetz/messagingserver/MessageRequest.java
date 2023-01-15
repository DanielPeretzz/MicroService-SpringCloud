package com.danielperetz.messagingserver;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageRequest {
    private String message;

}
