package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.LoginPage;
import pageObject.SearchCustomerPage;

public class BaseClass{

public WebDriver driver;
	
	public LoginPage loginPg;
	public SearchCustomerPage searchCustPg; 
	
	public AddNewCustomerPage addNewCustPg;
	
	public String genrateEmailID() {
		
		return(RandomStringUtils.randomAlphabetic(5));
		
	}
	
}
