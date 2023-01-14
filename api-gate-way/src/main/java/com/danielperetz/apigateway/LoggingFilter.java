package com.danielperetz.apigateway;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Component
public class LoggingFilter implements GlobalFilter {

    private Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.debug("request receive with path={}", exchange.getRequest().getPath());
        return chain.filter(exchange);
    }
}
