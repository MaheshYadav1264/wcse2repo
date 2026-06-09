package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedge.driver", "C:\\\\Users\\\\Swati Yadav\\\\OneDrive\\\\Desktop\\\\PracticeWork\\\\Drivers\\\\edgedriver_win64.zip");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demoqa.llq.vn/buttons");
		
		WebElement element = driver.findElement(By.id("doubleClickBtn"));
		
		Actions actions= new Actions(driver);
		
		
		//RightClict Action
		
		//actions.contextClick(element).perform();
		
		//DoubleClick Action
		
		actions.doubleClick(element).perform();
		
		driver.close();
	}

}
