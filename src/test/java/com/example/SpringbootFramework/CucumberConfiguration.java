package com.example.SpringbootFramework;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes =SpringbootFrameworkApplication.class)
public class CucumberConfiguration {
}
