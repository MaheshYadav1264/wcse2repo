package MyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Swati Yadav\\OneDrive\\Desktop\\PracticeWork\\Drivers\\edgedriver_win64.zip");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		WebElement element= driver.findElement(By.linkText("Toys"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(element).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.close();

	}

}
