package com.project.jwt.configs.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    
    @Bean
    public RouteLocator costumRouteLocater(RouteLocatorBuilder builder){
        return builder.routes()
               .route("user-service", r -> r.path("/api/v1/**")
                       .uri("http://localhost:8080"))
                       .build();
    }
}