package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Swati Yadav\\OneDrive\\Desktop\\PracticeWork\\Drivers\\edgedriver_win64.zip");
		
	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");

	}

}
