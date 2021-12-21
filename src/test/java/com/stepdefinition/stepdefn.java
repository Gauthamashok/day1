package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefn {

	WebDriver driver;

	@Given("user is on   adactin page")
	public void user_is_on_adactinHotel page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("user should enter {String}and{String}")
	public void user_should_enter_and(String username,String Password) {
		
		WebElement username = driver.findElement(By.id("username"));
username.sendKeys("username");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("password");
	}

	@When("user should click login buttton")
	public void user_should_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
	login.click();
	}
@When("user should search the hotel{String},{String},{String},{String},{String},{String}")
	public void user_should_search_the_hotel(String location,String hotel,String roomtype,Stringnoofroom,String adult,String child) {
	driver.findElement(By.id("location"));

}
	
	
	
	
	
	
	
	
	
	
	@Then("user should verify success msg")
	public void successmsg() {
    String currentUrl = driver.getCurrentUrl();
    boolean contains = currentUrl.contains("Hotel");
    
    Assert.assertTrue("verify url",contains);
    
	
	}

}
