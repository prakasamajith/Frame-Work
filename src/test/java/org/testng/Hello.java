package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello extends BaseClass {

	@Parameters({ "user", "password" })
	@Test(groups = "smoke")
	public void login(String user, String pass) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, user);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, pass);
		WebElement btnLogin = findLocatorByXpath("//button[@value=\"login\"]");
		elementClick(btnLogin);
	}

	@Test(groups = "smoke")

	private void searchTicket() {

	}

	@Test(groups = "sanity")

	private void selectTicket() {

	}

	@Test(groups = "reg")
	private void bookTicket() {

	}

	@Test(groups = "reg")
	private void address() {

	}

	@Test(groups = "sanity")

	private void payment() {

	}

}
