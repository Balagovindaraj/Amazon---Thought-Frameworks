package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\FlipKart.feature", glue = "com.step", monochrome = true)
@RunWith(Cucumber.class)
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void startUp() {
		// TODO Auto-generated method stub
		driver = Base_Class.browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub
		driver.close();
	}
}
