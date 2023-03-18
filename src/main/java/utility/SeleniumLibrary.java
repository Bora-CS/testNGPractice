package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumLibrary {
	
	private WebDriver driver;
	
	public SeleniumLibrary(WebDriver passedDriver) {
		driver = passedDriver;
	}
	
	public void openURL(String url) {
		driver.get(url);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	
	}

	public String getText(By locator){
		return driver.findElement(locator).getText();
	}
	
	public void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	
	
	void dynamicWait() {
		
	}
	
	void highLight() {
		
	}
	

}
