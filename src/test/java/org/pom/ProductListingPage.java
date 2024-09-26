package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListingPage extends BaseClass {

	@FindBy(xpath = "(//a[contains(text(),'Add')])[2]")
	private WebElement btnAdd;
	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	private WebElement addProduct;
	@FindBy(xpath = "//a[contains(text(),' Go To Cart ')]")
	private WebElement goToCartBtn;

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getAddProduct() {
		return addProduct;
	}

	public WebElement getGoToCartBtn() {
		return goToCartBtn;
	}

	public void productList() {
		elementClick(btnAdd);
		elementClick(addProduct);
		elementClick(goToCartBtn);
	}

}
