package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoraDriverManager {

	public static WebDriver setUpDriver() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("key", "DriverLocation");
		driver.manage().window().maximize();
		return driver;

	}

}
