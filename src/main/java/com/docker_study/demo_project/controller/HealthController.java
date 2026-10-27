package com.docker_study.demo_project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @Value("${app.environment:dev}")
    private String environment;

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "environment", environment,
            "message", "Aplicação rodando na Oracle Cloud! PDI DBServer."
        );
    }
}
