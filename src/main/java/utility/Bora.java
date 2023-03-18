package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import pages.DashBoardPage;
import pages.ExperiencePage;
import pages.LoginPage;

public class Bora {

	public SeleniumLibrary lib;
	
	public WebDriver driver;
	public LoginPage login;
	public ExperiencePage exPage;
	public DashBoardPage dashboard;
	
	@BeforeMethod
	public void startTest() {
		driver = BoraDriverManager.setUpDriver();
		lib = new SeleniumLibrary(driver);
		login = new LoginPage();
		exPage = new ExperiencePage();
		dashboard = new DashBoardPage();

	}
	
	
	
}
