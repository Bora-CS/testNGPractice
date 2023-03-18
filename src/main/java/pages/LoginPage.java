package pages;

import pageLocators.LoginPageLocator;
import utility.Bora;

public class LoginPage extends Bora {
	
	
	
	public void login(String userName, String password) {
		lib.click(LoginPageLocator.loginButton);
		lib.enterText(LoginPageLocator.userNameField, userName);
		lib.enterText(LoginPageLocator.passwordField, password);
		lib.click(LoginPageLocator.submitButton);
	}
	
	public void clickSubmitButton() {
		
	}
	

}
