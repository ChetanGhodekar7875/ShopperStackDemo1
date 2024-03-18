package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class RegistrationPagePom extends BaseClass{
	
	public RegistrationPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//h1)[1]")
	private WebElement ReagistrationPageText;
	
	@FindBy(id="First Name")
	private WebElement firstName;
	
	@FindBy(id="Last Name")
	private WebElement lastName;

	@FindBy(id="Female")
	private WebElement femaleGender;
	
	@FindBy(id="Male")
	private WebElement maleGender;
	
	@FindBy(id="Other")
	private WebElement otherGender;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id="Email Address")
	private WebElement emailAddress;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="Confirm Password")
	private WebElement confirmPassword;
	
	@FindBy(id="Terms and Conditions")
	private WebElement checkBox;
	
	@FindBy(id="btnDisabled")
	private WebElement registerButton;
	
	@FindBy(xpath = ".//div[text()='Given Email ID or Phone number already used']")
	private WebElement emailIdOrPhoneNumberAlredyUsed;

	public WebElement getReagistrationPageText() {
		return ReagistrationPageText;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getFemaleGender() {
		return femaleGender;
	}

	public WebElement getMaleGender() {
		return maleGender;
	}

	public WebElement getOtherGender() {
		return otherGender;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getEmailIdOrPhoneNumberAlredyUsed() {
		return emailIdOrPhoneNumberAlredyUsed;
	}
	
	
}
