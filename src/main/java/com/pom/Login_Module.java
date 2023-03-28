package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Module {

	WebDriver driver;

	public Login_Module(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement signInButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getProductCatogary() {
		return productCatogary;
	}

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public WebElement getAddToCartHome() {
		return AddToCartHome;
	}

	public WebElement getSubtotal() {
		return subtotal;
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	WebElement login;

	@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
	WebElement productCatogary;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchProduct;

	public WebElement getSearchProduct() {
		return searchProduct;
	}

	@FindBy(xpath = "//span[contains(text(),'All-new Echo Dot')]")
	WebElement product1;

	@FindBy(xpath = "//input[@value='Add to Cart']")
	WebElement addCart;
	
	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement AddToCartHome;
	
	@FindBy(xpath  ="//div[@data-name='Subtotals']/span")
	WebElement subtotal;
}
