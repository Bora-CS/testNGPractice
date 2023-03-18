package regressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Bora;

public class ValidateExperience extends Bora{

	
	
	public void verifyUserAbleToAddExperience() {


		// login
		lib.openURL("https://boratech-practice-app.onrender.com/");

		login.login("user", "a123");
		
		// add Experience
		dashboard.clickExperienceLink();
		exPage.enterExperience();
		
		
		// verify Experience exist

	}

	public void verifyUserAbleToEditExperience() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("key", "DriverLocation");
		driver.manage().window().maximize();

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();

		// find Experience
		driver.findElement(By.id("dummy locator")).click();
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("submit change")).click();

		// verify change

	}

	public void verifyUserAbleToDeleteExperience() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("key", "DriverLocation");
		driver.manage().window().maximize();

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();

		// find Experience
		driver.findElement(By.id("delete button")).click();

		// verify it is been delte

	}

}
