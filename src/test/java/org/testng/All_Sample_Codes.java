package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class All_Sample_Codes extends BaseClass {

	// Parameters
	@Test(enabled = false)
	@Parameters({ "userName", "password" })
	private void logIn(String userName, String password) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, userName);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, password);
	}

	// Priority
	@Test(priority = 4)
	private void payment() {
	}

	// InvocationCount
	@Test(invocationCount = 5, priority = 3)
	private void bookTicket() {

	}

	@Test(priority = 2)
	private void bookingConfirmation() {
	}

	//Data Provider
	@DataProvider(name = "fbdata")
	public Object[][] dataPro() {

		Object[][] obj = new Object[][]

		{ { "aji@gmail.com", "aji@123" }, { "arun@gmail.com", "arun@123" }, { "karthi@gmail.com", "karthi@123" } };
		return obj;
	}
	

}
