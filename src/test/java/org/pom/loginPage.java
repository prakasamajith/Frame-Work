package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BaseClass {

	@FindBy(id = "email")
	private WebElement txtUserName;
	@FindBy(id = "pass")
	private WebElement txtPassword;
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String emailId, String Password) {

		elementSendKeys(txtUserName, emailId);
		elementSendKeys(txtPassword, Password);
		elementClick(btnLogin);
	}
}
