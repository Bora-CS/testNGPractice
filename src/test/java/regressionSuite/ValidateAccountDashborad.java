package regressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateAccountDashborad {
	
	public void verifyUserAbleToAddEducation() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("key","DriverLocation");
		driver.manage().window().maximize();
		
		
		//login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();
		
		// validate dashboard
		String header = driver.findElement(By.id("header")).getText();
			// verify header
		String userName =  driver.findElement(By.id("userName")).getText();
			// verify userName
	}

}
