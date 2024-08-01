package com.BimaBharosa.testRunnrs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//src/test/java/features"},
        glue = {"com.BimaBharosa.Hooks","com.BimaBharosa.StepDefinations",},
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report/BimaBharosaReport.html",
                "json:target/cucumber-report/BimaBharosaReport.json",
                "junit:target/cucumber-report/BimaBharosaReport.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class TestRunner {
}
