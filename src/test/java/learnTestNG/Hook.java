package learnTestNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public class Hook {
	
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("This is beforeSuite");
	}
	
	@BeforeGroups
	public void beforeGroupTest() {
		System.out.println("This is beforeGroup");
	}

}
