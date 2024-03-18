package Pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SearchPagePom extends BaseClass{
	
	public SearchPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='featuredProducts_cardBody__l4gLE']")
	private List<WebElement> productSearch;
	
	@FindBy(partialLinkText = "men tshirt")
	private WebElement searchPageText;

	@FindBy(xpath = "(//button[text()='add to cart'])[1]")
	private WebElement addToTheCartButton;
	
	@FindBy(partialLinkText = "search products")
	private WebElement searchProductLink;
	
	@FindBy(xpath = "(//a)[2]")
	private WebElement cartButton;
	
	public List<WebElement> getProductSearch() {
		return productSearch;
	}

	public WebElement getSearchPageText() {
		return searchPageText;
	}

	public WebElement getAddToTheCartButton() {
		return addToTheCartButton;
	}

	public WebElement getSearchProductLink() {
		return searchProductLink;
	}

	public WebElement getCartButton() {
		return cartButton;
	}
	
	

	
}
