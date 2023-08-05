package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	
	public void JSClick(By locator) {
		WebElement m=driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].click();", m);
	}
	
	void dynamicWait() {
		
	}
	
	void highLight(By locator) {
		WebElement m=driver.findElement(locator);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				m);
		
	}
	

}
