package org.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BaseClass {

	@FindBy(xpath = "//a[@data-testid=\"username\"]")
	private WebElement user;
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(id = "v-pills-orders-tab")
	private WebElement ordersTab;
	@FindBy(xpath = "(//a[contains(text(),'More Details')])[1]")
	private WebElement moreDetails;
	@FindBy(xpath = "(//span[@class=\"font16 fontNormal color36\"])[1]")
	private WebElement orderNumber;

	public WebElement getUser() {
		return user;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getOrdersTab() {
		return ordersTab;
	}

	public WebElement getMoreDetails() {
		return moreDetails;
	}

	public WebElement getOrderNumber() {
		return orderNumber;
	}

	public void orderConfirmation() throws IOException {

		elementClick(user);
		elementClick(myAccount);
		elementClick(ordersTab);
		elementClick(moreDetails);
		String orderId = orderNumber.getText();
		createCellAndSetCellData("Sheet1", 1, 13, orderId);
	}
}
