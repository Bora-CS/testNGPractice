package regressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {
	
	public void verifyUserAbleToLogin() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("key","DriverLocation");
		driver.manage().window().maximize();
		
		
		//login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();
		
		// verify user is logined
		
	}
	
	public void verifyUserNotAbleToLoginWithWrongPassword() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("key","DriverLocation");
		driver.manage().window().maximize();
		
		
		//login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Wrong Password");
		driver.findElement(By.id("submitButton")).click();
		
		// verify error message for password
		
	}
	
	public void verifyUserNotAbleToLoginWithInvalidUserName() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("key","DriverLocation");
		driver.manage().window().maximize();
		
		
		//login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("Invalid userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();
		
		// verify error message for userName field
		
	}

}
