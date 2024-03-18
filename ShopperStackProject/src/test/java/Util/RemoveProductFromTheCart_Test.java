package Util;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.CartPagePom;
import Pom.HomePagePom;

public class RemoveProductFromTheCart_Test extends AddProductToTheCart_Test{
	
	@Test(dependsOnMethods = "addProductToTheCart")
	public void removeProductTotheCart() throws InterruptedException {
		HomePagePom homePage=new HomePagePom(webDriver);
		homePage.getCartButton().click();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CartPagePom cartPage=new CartPagePom(webDriver);
		boolean status=cartPage.getCartIsEmptyText().isDisplayed();
		if(!status) {
			cartPage.getRemoveProductFromTheCartButton().click();
			webDriver.switchTo().alert().accept();
		}else {
			Assert.assertTrue(status,"CART IS EMPTY");
		}
	}

}
