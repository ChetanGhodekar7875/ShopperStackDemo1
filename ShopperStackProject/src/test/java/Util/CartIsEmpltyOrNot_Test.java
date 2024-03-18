package Util;

import org.testng.annotations.Test;
import Pom.CartPagePom;
import Pom.HomePagePom;

public class CartIsEmpltyOrNot_Test extends LoginPage_Test{
	
	@Test(dependsOnMethods = {"loginMethod"})
	public void checkCartIsEmptyOrNot() throws InterruptedException {
		
		HomePagePom homePage=new HomePagePom(webDriver);
		homePage.getCartButton().click();
		
		CartPagePom cart=new CartPagePom(webDriver);
		cart.getCartIsEmptyText().isDisplayed();
		Thread.sleep(5000);
	}

}
