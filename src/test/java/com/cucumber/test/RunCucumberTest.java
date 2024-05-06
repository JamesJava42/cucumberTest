package com.cucumber.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "com.cucumber.test.stepDefinitions", // Path to your step definitions
    plugin = {"pretty", "html:target/cucumber-reports"}, 
    monochrome = true, // Better console output
    publish = true // Fail if there are undefined or pending steps
)
public class RunCucumberTest {

}
