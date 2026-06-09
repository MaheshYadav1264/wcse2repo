package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Swati Yadav\\OneDrive\\Desktop\\PracticeWork\\Drivers\\edgedriver_win64.zip");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")) .sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
	}

}
