package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		// TODO Auto-generated method stub
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Eclipse\\Eclipse Workspace\\FlipKart\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Eclipse\\Eclipse Workspace\\Adactin\\Driver\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("invalid");
		}

		return driver;

	}

	public static void getUrl(String url) {
		// TODO Auto-generated method stub
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void inputValue(WebElement e, String str) {
		// TODO Auto-generated method stub
		try {
			e.sendKeys(str);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement e) {
		// TODO Auto-generated method stub
		try {
			e.click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void DropDownSelectValues(WebElement e, String str) {
		// TODO Auto-generated method stub
		try {
			Select s = new Select(e);
			s.selectByValue(str);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void implicitlyWait() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Asserttion(WebElement e) {
		// TODO Auto-generated method stub
		try {
			if (e.getText().contains("2")) {
				System.out.println(e.getText());
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
