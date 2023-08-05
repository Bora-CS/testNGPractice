package parallelPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BoraDriverManager;
import utility.SeleniumLibrary;

public class PracticeParalle {
	

	@Test
	public void verifyUserAbleToAddEducation() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		SeleniumLibrary lib = new SeleniumLibrary(driver);
		LoginPage login = new LoginPage();
		
		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
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
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.xpath("//*[@href='/login']")).click();

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
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// login
		driver.get("https://boratech-practice-app.onrender.com/");
		driver.findElement(By.xpath("//*[@href='/login']")).click();

		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("userName")).sendKeys("userName");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submitButton")).click();

		// find education
		driver.findElement(By.id("delete button")).click();

		// verify it is been delte

	}

}
