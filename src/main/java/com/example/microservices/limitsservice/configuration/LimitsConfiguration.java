package com.example.microservices.limitsservice.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
@NoArgsConstructor
public class LimitsConfiguration {
    private int minimum;
    private int maximum;
}
