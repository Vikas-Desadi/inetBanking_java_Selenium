package com.inetBanking.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this );	
		
}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a" )
	@CacheLookup
	WebElement lnkAddNewCustomer;
    
	
	@FindBy(how = How.NAME, using = "name" )
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "rad1" )
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob" )
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using = "addr" )
	@CacheLookup
	WebElement txtCustomerAddr;
	
	@FindBy(how = How.NAME, using = "city" )
	@CacheLookup
	WebElement txtCustomerCity;
	
	@FindBy(how = How.NAME, using = "state" )
	@CacheLookup
	WebElement txtCustomerState;
	
	@FindBy(how = How.NAME, using = "pinno" )
	@CacheLookup
	WebElement txtCustomerPIN;
	
	@FindBy(how = How.NAME, using = "telephoneno" )
	@CacheLookup
	WebElement txtCustomerMobNum;
	
	@FindBy(how = How.NAME, using = "emailid" )
	@CacheLookup
	WebElement txtCustomerE_Mail;
	
	@FindBy(how = How.NAME, using = "password" )
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "sub" )
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void cliclNewCustomer() {
		lnkAddNewCustomer.click();
		
	}
	
	public void setUserName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}
	
	public void clickGender(String gender) {
		rdGender.click();
		
	}
	public void setdob(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	public void setAddress(String addr) {
		txtCustomerAddr.sendKeys(addr);
		
	}
	public void setCity(String city) {
		txtCustomerCity.sendKeys(city);
		
	}
	public void setState(String state) {
		txtCustomerState.sendKeys(state);
		
	}
	public void setPin(String pin) {
		txtCustomerPIN.sendKeys(pin);
		
	}
	public void setMobileNumber(String mbno) {
		txtCustomerMobNum.sendKeys(mbno);
		
	}
	public void setEmail(String email) {
		txtCustomerE_Mail.sendKeys(email);
		
	}
	

    public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
	
     }

     public void ClickSubmit() {
    	 btnSubmit.click();;
	
     }
	
	
}
