package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPagePom extends BaseClass{
	
	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong")
	private WebElement shopperLoginPageText;

	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath  = "(//button[@id='Login'])[1]")
	private WebElement loginButton;

	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(xpath = "//div[text()='Given user ID or password is wrong']")
	private WebElement invalidUserNameOrPasswordMsg;
	
	public WebElement getShopperLoginPageText() {
		return shopperLoginPageText;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getInvalidUserNameOrPasswordMsg() {
		return invalidUserNameOrPasswordMsg;
	}
	

}
