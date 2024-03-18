package Util;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom.HomePagePom;
import Pom.LoginPagePom;

public class LoginPage_Test extends BaseClass{
	
	@DataProvider
	public String[][] data() {
		String[][] loginData=null;
		
		GetSheetData g=new GetSheetData("Sheet2");
		
		Sheet s=g.getSheet();
		int row=g.getRow();
		int col=g.getColumn();
		System.out.println(row);
		System.out.println(col);
		
		loginData=new String[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				loginData[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return loginData;	
	}
	
	@Test(dataProvider = "data")
	public void loginMethod(String[] data) throws InterruptedException {
		HomePagePom homePage=new HomePagePom(webDriver);
		homePage.getWelcomeMesaage().isDisplayed();
		Thread.sleep(10000);
		homePage.getLoginButton().click();
		
		LoginPagePom login=new LoginPagePom(webDriver);
		login.getShopperLoginPageText().isDisplayed();
		
		login.getEmailTextField().sendKeys(data[0]);
		login.getPasswordTextField().sendKeys(data[1]);
		login.getLoginButton().click();
			
		homePage.getHomePageText().isDisplayed();		
		Thread.sleep(10000);
	}

}
