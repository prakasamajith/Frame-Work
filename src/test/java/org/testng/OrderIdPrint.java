package org.testng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Place order and print orderId in Excel Sheet using TestNG
public class OrderIdPrint extends BaseClass {

	
	@BeforeClass
	public void launch() {
		chromeBrowserLaunch();
		maximizeWindow();
		implicitWait(30);
		enterApplnUrl("https://omrbranch.com/");
	}

	
	@Test(priority = 1)
	public void login() throws IOException {
		WebElement txtUsername = findLocatorById("email");
		elementSendKeys(txtUsername, getCellData("Sheet1", 1, 0));
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, getCellData("Sheet1", 1, 1));
		WebElement btnLogin = findLocatorByXpath("//button[@value=\"login\"]");
		elementClick(btnLogin);
	}

	
	@Test(priority = 2)
	public void addProduct() throws InterruptedException {
		WebElement searchBox = findLocatorById("search");
		elementSendKeys(searchBox, "Nuts");
		WebElement submitBtn = findLocatorByXpath("//button[@data-testid=\"searchbtn\"]");
		elementClick(submitBtn);
		WebElement addBtn = findLocatorByXpath("(//a[text()=\"Add\"])[5]");
		visibilityOfElement(addBtn);
		elementClick(addBtn);
		WebElement add = findLocatorByXpath("//button[@id=\"cart-30\"]");
		visibilityOfElement(add);
		elementClick(add);
		Thread.sleep(2000);
		WebElement goToCart = findLocatorByClassName("hover1");
		visibilityOfElement(goToCart);
		elementClick(goToCart);
	}

	
	@Test(priority = 3)
	public void addAddress() throws IOException, InterruptedException {
		WebElement addAddress = findLocatorByXpath("//div[@data-target=\"#addressModal\"]");
		elementClick(addAddress);
		WebElement addressType = findLocatorById("address_type");
		elementSendKeys(addressType, getCellData("Sheet1", 1, 2));
		WebElement firstName = findLocatorByName("first_name");
		visibilityOfElement(firstName);
		elementSendKeys(firstName, getCellData("Sheet1", 1, 3));
		WebElement lastName = findLocatorByName("last_name");
		elementSendKeys(lastName, getCellData("Sheet1", 1, 4));
		WebElement mobile = findLocatorByName("mobile");
		elementSendKeys(mobile, getCellData("Sheet1", 1, 5));
		WebElement houseNo = findLocatorByName("apartment");
		elementSendKeys(houseNo, getCellData("Sheet1", 1, 6));
		WebElement address = findLocatorByName("address");
		elementSendKeys(address, getCellData("Sheet1", 1, 7));
		WebElement state = findLocatorByName("state");
		elementSendKeys(state, getCellData("Sheet1", 1, 8));
		Thread.sleep(1000);
		WebElement city = findLocatorByName("city");
		visibilityOfElement(city);
		elementSendKeys(city, getCellData("Sheet1", 1, 9));
		WebElement zipCode = findLocatorByName("zipcode");
		elementSendKeys(zipCode, getCellData("Sheet1", 1, 10));
		WebElement saveBtn = findLocatorByXpath("(//button[@type=\"submit\"])[3]");
		elementClick(saveBtn);
	}
	
	@Test(priority = 4)
	public void payment() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement paymentType = findLocatorById("payment_type");
		visibilityOfElement(paymentType);
		selectDropdownIndex(paymentType, 1);
		WebElement visa = findLocatorByXpath("//label[@for=\"visa_card\"]");
		visibilityOfElement(visa);
		elementClick(visa);
		WebElement cardNo = findLocatorByName("card_no");
		elementSendKeys(cardNo, getCellData("Sheet1", 1, 11));
		WebElement month = findLocatorByName("month");
		selectDropdownIndex(month, 7);
		WebElement year = findLocatorByName("year");
		selectDropdownIndex(year, 6);
		WebElement cvv = findLocatorByName("cvv");
		elementSendKeys(cvv, getCellData("Sheet1", 1, 12));
		WebElement placeOrder = findLocatorById("placeOrder");
		elementClick(placeOrder);

	}
	
	@AfterClass
	public void close() {
//		driver.close();	
	}
	
	@Test (priority=5)
	public void newLogin() throws IOException {
		chromeBrowserLaunch();
		maximizeWindow();
		implicitWait(30);
		enterApplnUrl("https://omrbranch.com/");
		WebElement txtUsername = findLocatorById("email");
		elementSendKeys(txtUsername, getCellData("Sheet1", 1, 0));
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, getCellData("Sheet1", 1, 1));
		WebElement btnLogin = findLocatorByXpath("//button[@value=\"login\"]");
		elementClick(btnLogin);
	}
	@Test(priority=6)
	public void myAccount() throws IOException {
		WebElement user = findLocatorByXpath("//a[@data-testid=\"username\"]");
		elementClick(user);
		WebElement myAccount = findLocatorByXpath("//a[contains(text(),'My Account')]");
		elementClick(myAccount);
		WebElement ordersTab = findLocatorById("v-pills-orders-tab");
		elementClick(ordersTab);
		WebElement moreDetails = findLocatorByXpath("(//a[contains(text(),'More Details')])[1]");
		elementClick(moreDetails);
		WebElement orderNo = findLocatorByXpath("(//span[@class=\"font16 fontNormal color36\"])[1]");
		String orderId = orderNo.getText();
		createCellAndSetCellData("Sheet1", 1, 13, orderId);
//		WebElement product = findLocatorByXpath("(//p[contains(text(),'B')])[1]");
//		String productName = product.getText();
//		visibilityOfElement(product);
//		createCellAndSetCellData("Sheet", 1, 14, productName);
//		WebElement price = findLocatorByXpath("//span[@data-testid=\"new-price\"]");
//		String newprice = price.getText();
//		visibilityOfElement(price);
//		createCellAndSetCellData("Sheet", 1, 15, newprice);
	}
	
}
