package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.msedge.driver", "C:\\\\Users\\\\Swati Yadav\\\\OneDrive\\\\Desktop\\\\PracticeWork\\\\Drivers\\\\edgedriver_win64.zip");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");
		
		WebElement source = driver.findElement(By.id("box6"));
		
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();

	}

}
