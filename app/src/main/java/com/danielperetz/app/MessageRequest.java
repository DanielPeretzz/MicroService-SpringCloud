package com.danielperetz.app;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageRequest {
    private String message;

}
