package com.intebanking.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass{

	    @Test
		public void loginTest() throws InterruptedException {
			
	    	logger.info("URL is opened");
	    	
	    	LoginPage lp = new LoginPage(driver);
	    	lp.setUserName(username);
	    	lp.setPassword(password);
	    	lp.clickSubmit();
	    	Thread.sleep(3000);
	    	
	    	String act_title = driver.getTitle();
	    	System.out.println(act_title);
	    	if (driver.getTitle().equals("Guru99 Bank Manager HomePage")){
	    		Assert.assertTrue(true);
	    		logger.info("Login test Passed");
	    			
	    	}else {
	    		Assert.assertTrue(false);
	    		logger.info("Login test Failed");
	    	}
	    
		}
	

}
