package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnBeforeAfter {
	
	@BeforeMethod
	public void startTest() {
		System.out.println("This is start test method");
	}

	@AfterClass
	public void endTest() {
		System.out.println("This is end test method");
	}
	
	@BeforeTest
	public void beforeTestNGTest() {
		System.out.println("This is for beforeTest");
	}
	

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test 2");

	}

	@Test
	public void test3() {
		System.out.println("This is test 3");

	}

	
	
	public void customWait() {
		
	}
	
}
