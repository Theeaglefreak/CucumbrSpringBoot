package com.example.SpringbootFramework.datasets;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class RunConfig {

    @Value("${browser}")
    private String browser;

    @Value("${testType}")
    private String testType;
}
