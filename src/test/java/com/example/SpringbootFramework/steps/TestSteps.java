package com.example.SpringbootFramework.steps;
import com.example.SpringbootFramework.datasets.RunConfig;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSteps {

    @Autowired
    RunConfig runconfig;
    @Given("User tries to enter value in calculator and it works")
    public void user_tries_to_enter_value_in_calculator_and_it_works() {
        System.out.println("Starting a test type as  " + runconfig.getTestType());
        System.out.println("Starting a test type as  " + runconfig.getBrowser());
        System.out.println("test working");
    }
}
