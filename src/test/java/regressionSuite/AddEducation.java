package regressionSuite;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Bora;
import utility.BoraDriverManager;
import utility.SeleniumLibrary;

public class AddEducation extends Bora{
	
	
	@Test
	public void verifyUserAbleToAddEducation() {
		
		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		
		login.login("user","123");
		
		// add education
		lib.click(By.id("Education link"));
		lib.enterText(By.id("dummy locator"), "date");
		lib.enterText(By.id("dummy locator"), "date");
		lib.enterText(By.id("dummy locator"), "date");
		lib.enterText(By.id("dummy locator"), "date");
		lib.enterText(By.id("dummy locator"), "date");
		lib.enterText(By.id("dummy locator"), "date");
		lib.click(By.id("submit"));
		
		// verify education exist

	}

	@Test
	public void verifyUserAbleToEditEducation() {

		driver =	BoraDriverManager.setUpDriver();

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();

		// find education
		driver.findElement(By.id("dummy locator")).click();
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("dummy locator")).sendKeys("date");
		driver.findElement(By.id("submit change")).click();

		// verify change

	}

	@Test
	public void verifyUserAbleToDeleteEducation() {

		driver =	BoraDriverManager.setUpDriver();

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();

		// find education
		driver.findElement(By.id("delete button")).click();

		// verify it is been delte

	}

}
