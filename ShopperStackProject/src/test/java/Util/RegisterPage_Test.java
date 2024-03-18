package Util;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom.HomePagePom;
import Pom.LoginPagePom;
import Pom.RegistrationPagePom;

public class RegisterPage_Test extends BaseClass{
	
	@DataProvider
	public String[][] data() {
		String[][] registerData=null;
		
		GetSheetData g=new GetSheetData("Sheet1");
		
		Sheet s=g.getSheet();
		int row=g.getRow();
		int col=g.getColumn();
		System.out.println(row);
		System.out.println(col);
		
		registerData=new String[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				registerData[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return registerData;	
	}
	
	@Test(dataProvider = "data")
	public void enterData(String[] temp) throws InterruptedException {
		HomePagePom homePage=new HomePagePom(webDriver);
		webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		homePage.getWelcomeMesaage().isDisplayed();
		homePage.getLoginButton().click();
		
		LoginPagePom login=new LoginPagePom(webDriver);
		login.getShopperLoginPageText().isDisplayed();
		login.getCreateAccountButton().click();
		
		RegistrationPagePom registration=new RegistrationPagePom(webDriver);
		registration.getReagistrationPageText().isDisplayed();
		
		registration.getFirstName().sendKeys(temp[0]);
		
		registration.getLastName().sendKeys(temp[1]);
		
		if(temp[2].equalsIgnoreCase("Male"))
			registration.getMaleGender().click();
		else if(temp[2].equalsIgnoreCase("Female"))
			registration.getFemaleGender().click();
		else registration.getOtherGender().click();
		
		registration.getPhoneNumber().sendKeys(temp[3]);
		registration.getEmailAddress().sendKeys(temp[4]);
		registration.getPassword().sendKeys(temp[5]);
		registration.getConfirmPassword().sendKeys(temp[6]);
		registration.getCheckBox().click();
		registration.getRegisterButton().click();
		
		boolean res1=registration.getEmailIdOrPhoneNumberAlredyUsed().isDisplayed();
		boolean res2 = false;
		if(!res1)
		 res2=homePage.getSuccessfullyRegisterMessage().isDisplayed();
		
		if(res2)
			Assert.assertTrue(res2,"SUCCESSFUL REGISTRATION");
		else
			Assert.assertFalse(res2,"UNSUCESSFULL REGISTRATION");
		
	}

}
