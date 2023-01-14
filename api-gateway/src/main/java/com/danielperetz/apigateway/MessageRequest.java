package com.danielperetz.apigateway;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageRequest {
    private String message;

}
