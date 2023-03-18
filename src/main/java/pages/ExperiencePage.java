package pages;

import org.openqa.selenium.By;

import utility.Bora;

public class ExperiencePage extends Bora{
	
	
	public void enterExperience() {
		lib.enterText(null, null);
		lib.enterText(By.id("dummy locator"),"date");
		lib.enterText(By.id("dummy locator"),"date");
		lib.enterText(By.id("dummy locator"),"date");
		lib.enterText(By.id("dummy locator"),"date");
		lib.enterText(By.id("dummy locator"),"date");
		lib.click(By.id("submit"));

	}
	

}
