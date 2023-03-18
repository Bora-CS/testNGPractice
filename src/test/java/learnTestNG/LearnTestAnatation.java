package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnTestAnatation {
	
	@Test(priority = 1)
	public void createUserForTest() {
		System.out.println("This is create user");
		Assert.fail();
	}
	
	
	@Test(priority = 0, dependsOnMethods = {"createUserForTest"})
	public void firstTest() {
		System.out.println("This is for TestNG");
	}
	
	@Test(enabled = false)
	public void A1testIt() {
		System.out.println("This is 2nd test");
	}
	@Test (timeOut = 4000)
	public void Aatestprint() throws InterruptedException {
		System.out.println("This is 3rd test");
		Thread.sleep(2990);
	}

}
