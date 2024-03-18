package FunctionalTestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pom.HomePagePom;
import Pom.LoginPagePom;
import Util.GetSheetData;

public class LoginFuctinalTestCase_001_Test extends BaseClass{
	@DataProvider
	public String[][] test() {
		String[][] loginData=null;
		
		GetSheetData g=new GetSheetData("Sheet3");
		
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
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(loginData[i][j]+"\t");
			}
			System.out.println();
		}
		return loginData;	
	}
	
	@Test(dataProvider = "test")
	public void validData(String email,String pass) throws InterruptedException, AWTException {
		
		HomePagePom homePage=new HomePagePom(webDriver);
		Thread.sleep(5000);
		homePage.getLoginButton().click();
		
		LoginPagePom loginPage=new LoginPagePom(webDriver);
	
		boolean status=loginPage.getShopperLoginPageText().isDisplayed();
		 {
		if(status) {
			loginPage.getEmailTextField().sendKeys(email);
			loginPage.getPasswordTextField().sendKeys(pass);
			Thread.sleep(4000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			boolean temp=loginPage.getInvalidUserNameOrPasswordMsg().isDisplayed();
			Assert.assertFalse(temp, "invalid");
		
		}else {
			Assert.assertFalse(status,"SOMETHING WENT WRONG");
		}
		//Thread.sleep(8000);
		}
	}
}
