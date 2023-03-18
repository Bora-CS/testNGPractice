package learnTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnBeforeAfter2 {

	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("This is beforeSuite");
	}
	
	@BeforeGroups
	public void beforeGroupTest() {
		System.out.println("This is beforeGroup");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is beforeMethod");
	}
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("This is beforeClass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is beforeTest");
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
	
	
	
	
	
	
	
	
}
