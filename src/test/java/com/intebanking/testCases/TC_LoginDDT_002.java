package com.intebanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.intebanking.utilities.XcelUtils;

public class TC_LoginDDT_002 extends BaseClass{
    
	@Test(dataProvider="LoginData")
	public void LoginDDT(String user,String pwd ) throws InterruptedException, IOException{
		
		System.out.println(getData());
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		
		if (isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else {
			Assert.assertTrue(true);
			logger.warn("Login Passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException{
		String path = System.getProperty("user.dir")+"/testData/Book1.xlsx";
		
		int rowNum = XcelUtils.getRowCount(path, "Sheet1");
		int colcount = XcelUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rowNum][colcount];
		for (int i=1; i<rowNum; i++) {
			for(int j=0; j<colcount; j++) {
				logindata[i-1][j] = XcelUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		return logindata;
	}
	
}
