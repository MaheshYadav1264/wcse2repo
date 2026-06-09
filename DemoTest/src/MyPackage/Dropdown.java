package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.msedge.driver", "C:\\Users\\Swati Yadav\\OneDrive\\Desktop\\PracticeWork\\Drivers\\edgedriver_win64.zip");
		
		WebDriver driver = new EdgeDriver();
		
        driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")) .sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		WebElement element= driver.findElement(By.className("product_sort_container"));
		
		Select dropdown = new Select(element);
		
		//dropdown.selectByVisibleText("Price (high to low)");
		//dropdown.selectByIndex(1);
		dropdown.selectByValue("hilo");
		
	}

}
