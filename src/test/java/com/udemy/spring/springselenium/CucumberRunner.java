package com.udemy.spring.springselenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.udemy.spring.springselenium.bdd",
        tags = "@visa",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}


// https://github.com/cucumber/cucumber-jvm/blob/main/CHANGELOG.md
// mvn clean verify -Dcucumber.filter.tags="@vsa"