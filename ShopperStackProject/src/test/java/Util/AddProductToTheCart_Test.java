package Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pom.CartPagePom;
import Pom.HomePagePom;
import Pom.SearchPagePom;

public class AddProductToTheCart_Test extends LoginPage_Test{
	
	@Test(dependsOnMethods = "loginMethod")
	public void addProductToTheCart() {
		HomePagePom homePage=new HomePagePom(webDriver);
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homePage.getHomePageText();
		homePage.getSearchButtonTextField().sendKeys("tshirt");
		homePage.getSearchButton().click();
		
		SearchPagePom searchPage=new SearchPagePom(webDriver);
		 
			List<WebElement> product=searchPage.getProductSearch();
			
			if(product.size()>0) {
				searchPage.getAddToTheCartButton().click();
				
				CartPagePom cartPage=new CartPagePom(webDriver);
				cartPage.getCartButton().click();
				cartPage.getTotalNumberOfProducts().isDisplayed();
				
			}
		
	}

}
