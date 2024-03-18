package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePagePom extends BaseClass{
	
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "(//h3)[1]")
	private WebElement welcomeMesaage;
	
	@FindBy(linkText = "Home")
	private WebElement homeLink;
	
	@FindBy(xpath = "//div[text()='Successfully Registered']")
	private WebElement successfullyRegisterMessage;
	
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homePageText;
	
	@FindBy(xpath = "(//a)[2]")
	private WebElement cartButton;
	
	@FindBy(id="search")
	private WebElement searchButtonTextField;
	
	@FindBy(id="searchBtn")
	private WebElement searchButton;
	
	@FindBy(linkText = "Men")
	private WebElement menLink;
	
	@FindBy(linkText = "T-shirts")
	private WebElement tShirtLink;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getWelcomeMesaage() {
		return welcomeMesaage;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getSuccessfullyRegisterMessage() {
		return successfullyRegisterMessage;
	}

	public WebElement getHomePageText() {
		return homePageText;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getSearchButtonTextField() {
		return searchButtonTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement gettShirtLink() {
		return tShirtLink;
	}
	
	
	
}
