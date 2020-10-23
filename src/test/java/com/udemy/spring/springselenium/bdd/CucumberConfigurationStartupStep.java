package com.udemy.spring.springselenium.bdd;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.BeforeTest;

@CucumberContextConfiguration
@SpringBootTest
public class CucumberConfigurationStartupStep {

    @BeforeTest
    public void setupSPringContext() { }
}
