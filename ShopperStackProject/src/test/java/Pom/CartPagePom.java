package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CartPagePom extends BaseClass{
	
	
	public CartPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cart")
	private WebElement cartIsEmptyText;
	
	@FindBy(xpath = "//div[@class='cart_checkoutProductContainer__jtOKS']")
	private WebElement totalNumberOfProducts;
	
	@FindBy(xpath = "(//a)[2]")
	private WebElement cartButton;
	
	@FindBy(xpath = "(//button)[2]")
	private WebElement removeProductFromTheCartButton;
	
	
	public WebElement getCartIsEmptyText() {
		return cartIsEmptyText;
	}

	public WebElement getTotalNumberOfProducts() {
		return totalNumberOfProducts;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getRemoveProductFromTheCartButton() {
		return removeProductFromTheCartButton;
	}
	
}
