package com.example.microservices.limitsservice.controller;

import com.example.microservices.limitsservice.configuration.LimitsConfiguration;
import com.example.microservices.limitsservice.dto.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final LimitsConfiguration limitsConfiguration;

    @Autowired
    public LimitsController(LimitsConfiguration limitsConfiguration) {
        this.limitsConfiguration = limitsConfiguration;
    }

    @GetMapping("/limits")
    public Limits getLimit() {
        return new Limits(limitsConfiguration.getMinimum(),
                limitsConfiguration.getMaximum());
    }
}
