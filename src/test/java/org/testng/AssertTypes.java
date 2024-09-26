package org.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypes extends BaseClass {
	
	//Hard Assert (it use only High priority test cases)
	@Parameters({"userName","password"})
	@Test(enabled = false)
	public void assertVerify(String u, String p) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		Assert.assertTrue(getCurrentUrl().contains("omr"), "Verify URL");
		Assert.assertEquals(getApplnTitle(),"Thoraipakkam OMR Branch", "Verify Title");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, u);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, p);
	}
	
	//Soft Assert
	
	@Parameters({"userName","password"})
	@Test
	public void assertSoft(String p, String d) {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		SoftAssert s=new SoftAssert();
		s.assertTrue(getCurrentUrl().contains("branch"), "Verify URL");
		s.assertEquals(getApplnTitle(),"Thoraipakkam OMR Branch","Verify Title");
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, p);
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, d);
		s.assertAll();
	}

}
