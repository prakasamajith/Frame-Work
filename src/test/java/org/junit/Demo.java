package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass {

	@BeforeClass
	public static void m1() {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		implicitWait(10);
	}

	@Test
	public void m2() {
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, "ajithprakasam@gmail.com");

		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, "Prakasam@77");

		WebElement btnLogin = findLocatorByXpath("//button[@value='login']");
		elementClick(btnLogin);
	}

	@Test
	public void m3() {

		String url = getCurrentUrl();
		boolean contains = url.contains("omr");
		Assert.assertTrue("verify url", contains);
		System.out.println(contains);

	}

	@Ignore
	@Test
	public void m4() {

		String title = getApplnTitle();
		System.out.println(title);
		String expectedTitle = ("Thoraipakkam OMR Branch");
		Assert.assertEquals("verify title", expectedTitle, title);
	}


}
