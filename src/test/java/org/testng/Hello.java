package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello extends BaseClass {

	@Test
	@Parameters({"username","password"})
	private void login(@Optional("arun@gmail.com") String username, String password) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, username);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, password);
	}

}
