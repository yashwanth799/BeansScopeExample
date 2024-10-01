package com.ivoyant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton") // Singleton scope
    public Engine engineSingleton() {
        return new Engine("Singleton Engine");
    }

    @Bean
    @Scope("prototype") // Prototype scope
    public Engine enginePrototype() {
        return new Engine("Prototype Engine");
    }

    @Bean
    @Scope("request") // Request scope
    public Engine engineRequest() {
        return new Engine("Request Engine");
    }

    @Bean
    @Scope("session") // Session scope
    public Engine engineSession() {
        return new Engine("Session Engine");
    }

    @Bean
    @Scope("application") // Application scope
    public Engine engineApplication() {
        return new Engine("Application Engine");
    }
}
