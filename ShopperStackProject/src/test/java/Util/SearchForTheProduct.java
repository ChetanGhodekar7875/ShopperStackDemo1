package Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pom.HomePagePom;
import Pom.SearchPagePom;

public class SearchForTheProduct extends LoginPage_Test{
	
	@Test(dependsOnMethods = {"loginMethod"})
	public void searchForTheProduct() throws InterruptedException {
		HomePagePom homePage=new HomePagePom(webDriver);
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homePage.getHomePageText().isDisplayed();
		homePage.getSearchButtonTextField().sendKeys("shirt");
		homePage.getSearchButton().click();
		
		SearchPagePom search=new SearchPagePom(webDriver);
		List<WebElement> product=search.getProductSearch();
		product.isEmpty();
		System.out.println(product.size());
		Thread.sleep(5000);
	}

}
