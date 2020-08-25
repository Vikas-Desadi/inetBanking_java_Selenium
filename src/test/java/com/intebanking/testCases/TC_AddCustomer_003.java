package com.intebanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass{
	@Test
	public void addNewCustomer() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver) ;
		addcust.cliclNewCustomer();
		addcust.setUserName("Pavan");
		addcust.clickGender("male");
		addcust.setdob("10", "15", "1990");
		Thread.sleep(3000);
		addcust.setAddress("India");
		addcust.setCity("Hyd");
		addcust.setState("AP");
		addcust.setPin("517247");
		addcust.setMobileNumber("9620860596");
		String email= randomstring()+"@gmail.com";
		addcust.setEmail(email);
		addcust.setPassword("khfhdgk");
		logger.info("All details submitted");
		addcust.ClickSubmit();
		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Test case Passed");
		}else {
			
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
	}
	
	public String randomstring() {
		String genString = RandomStringUtils.randomAlphabetic(8);
		return genString;
		
	}

}
