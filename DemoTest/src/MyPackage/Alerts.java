package MyPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.msedge.driver", "C:\\Users\\Swati Yadav\\OneDrive\\Desktop\\PracticeWork\\Drivers\\edgedriver_win64.zip");
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		//driver.findElement(By.id("alertButton")).click();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		
		driver.switchTo().alert().sendKeys("Mahesh Yadav");
	
		driver.switchTo().alert().accept();
		
		System.out.println("Mahesh Yadav");

	}

}
