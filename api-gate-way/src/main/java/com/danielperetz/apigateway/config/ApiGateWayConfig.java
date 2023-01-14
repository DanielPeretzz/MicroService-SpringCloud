package com.danielperetz.apigateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfig {

    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p
                        .path("/post")
                        .uri("http://messaging-server/api/message")
                ).build();
    }
}
