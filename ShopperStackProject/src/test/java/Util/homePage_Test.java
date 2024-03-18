package Util;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pom.HomePagePom;

public class homePage_Test extends BaseClass{
	
	@Test()
	public void clickonLoginButton() throws InterruptedException {
		HomePagePom homePage=new HomePagePom(webDriver);
		homePage.getWelcomeMesaage().isDisplayed();
	}

}
