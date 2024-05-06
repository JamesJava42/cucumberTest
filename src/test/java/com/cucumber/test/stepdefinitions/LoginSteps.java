package com.cucumber.test.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	    private WebDriver driver;

	    @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("http://localhost:8080/login");
	    }

	    @When("I enter valid credentials")
	    public void i_enter_valid_credentials() {
	    	driver.findElement(By.id("username")).sendKeys("user");
	        driver.findElement(By.id("password")).sendKeys("password");
	        driver.findElement(By.id("submit")).click();
	        // Implementation of entering credentials
	    }

	    @Then("I should be redirected to the dashboard page")
	    public void i_should_be_redirected_to_the_dashboard_page() {
	        // Implementation of dashboard check
	    	assertEquals("http://example.com/home", driver.getCurrentUrl());
	        driver.quit();
	    }

}
