package learnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewPractie1 {

	
	public void test() throws InterruptedException {
		
		Thread.sleep(1000);
	}
	
	
	public void testEx() throws Exception {
		
		throw new Exception("this is my custom expception");
		
	}
	
	
	public void clickElem(By locator) {
		
		
		
		WebDriverWait wait = new WebDriverWait(null, Duration.ofSeconds(20));
		
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		
		
	}

	
	
}
