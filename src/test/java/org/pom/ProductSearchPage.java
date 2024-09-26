package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BaseClass {

	@FindBy(id = "search")
	private WebElement searchBox;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void product(String productName) {
		elementSendKeysEnter(searchBox, productName);
		elementClick(btnSubmit);

	}

}
