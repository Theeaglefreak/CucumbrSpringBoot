package com.example.SpringbootFramework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
glue="classpath:com.example.SpringbootFramework",
publish=true)
public class TestRunner {

}
