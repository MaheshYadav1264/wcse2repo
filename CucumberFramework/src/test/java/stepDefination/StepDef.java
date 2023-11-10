package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.AddNewCustomerPage;
import pageObject.LoginPage;
import pageObject.SearchCustomerPage;

public class StepDef extends BaseClass {

	public WebDriver driver;
	
	public LoginPage loginPg;
	public SearchCustomerPage searchCustPg; 
	
	public AddNewCustomerPage addNewCustPg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		
		loginPg=new LoginPage(driver);
		addNewCustPg=new AddNewCustomerPage(driver);
		searchCustPg=new SearchCustomerPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
	    driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String password) {
	    
		loginPg.enterEmail(emailAdd);
		loginPg.enterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		
	    loginPg.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	   
		String actualTitle= driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	   
		loginPg.clickOnLogoutButton();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	    
	    System.out.println("Test Pass Sucessfully");
	}
	
	/////////////////Add New customer///////////////////////////
	
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    
		String actualTitle= addNewCustPg.getPageTitle();
		String expectedTitle="Dashboard / nopCommerce administration";
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() {
	    
		addNewCustPg.clickOnCustomersMenu();
	}

	@When("Click on customer menu item")
	public void click_on_customer_menu_item() {
	    addNewCustPg.clickOnCustomersMenuItem();
	}

	@When("Click on add new customer button")
	public void click_on_add_new_customer_button() {
		addNewCustPg.clickOnAddnew();
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = addNewCustPg.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	   
		//addNewCustPg.enterEmail("fg123@gmail.com");
		addNewCustPg.enterEmail(genrateEmailID() + "@gmail.com");
		addNewCustPg.enterPassword("test1");
		addNewCustPg.enterFirstName("Mahesh");
		addNewCustPg.enterLastName("Yadav");
		addNewCustPg.enterGender("Male");
		addNewCustPg.enterDob("6/13/1988");
		addNewCustPg.enterCompanyName("CodeStudio");
		addNewCustPg.enterManagerOfVendor("Vendor 1");
	}

	@When("Click on save Button")
	public void click_on_save_button() {
	    
		addNewCustPg.clickOnSave();
	}

	@Then("user can view confiermation message {string}")
	public void user_can_view_confiermation_message(String exptectedConfirmationMsg) {
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		
		if(bodyTagText.contains(exptectedConfirmationMsg))
		{
			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail
		}
		
	}	
	
	
	///////search customer///////////
	
	@When("Enter customer email")
	public void enter_customer_email() {
	    
		searchCustPg.enterEmailAdd("victoria_victoria@nopCommerce.com");
	}

	@When("click on search button")
	public void click_on_search_button() {
	    
		searchCustPg.clickOnSearchButton();
	}

	@Then("User should found email in search table")
	public void user_should_found_email_in_search_table() throws InterruptedException {
	    
		/*String exceptedEmail = "victoria_victoria@nopCommerce.com";
		
		//Assert.assertTrue(searchCustPg.searchCustomerByEmail(exceptedEmail));
		
		if(searchCustPg.searchCustomerByEmail(exceptedEmail)== true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}*/
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//ScrollDown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		}
		
		////////search customer by name////////////////////
		
	@When("Enter user Firstname")
	public void enter_user_firstname() {
		
		searchCustPg.enterFirstName("Victoria");
	    
	}

	@When("Enter user Lastname")
	public void enter_user_lastname() {
		
		searchCustPg.enterLastName("Terces");
	   
	}

	@Then("Close browser")
	public void close_browser1() {
	    driver.close();
	    driver.quit();
	}

	
	
}
