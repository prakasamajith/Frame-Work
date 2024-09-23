package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample extends BaseClass {
	
	@Test
	@Parameters({"userName","password"})
	private void logIn(String userName, String password) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, userName);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, password);
	}

	@Test(priority = 4)
	private void payment() {
	}
	
	@Test(invocationCount = 5,priority = 3)
	private void bookTicket() {

	}
	@Test(priority = 2)
	private void bookingConfirmation() {

	}

}
