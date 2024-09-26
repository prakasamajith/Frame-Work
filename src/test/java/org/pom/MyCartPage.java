package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage extends BaseClass {

	@FindBy(xpath = "//div[@data-toggle=\"modal\"]")
	private WebElement addAddress;
	@FindBy(id = "address_type")
	private WebElement addressType;
	@FindBy(name = "first_name")
	private WebElement firstName;
	@FindBy(name = "last_name")
	private WebElement lastName;
	@FindBy(name = "mobile")
	private WebElement mobileNumber;
	@FindBy(name = "apartment")
	private WebElement houseNo;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "state")
	private WebElement state;
	@FindBy(name = "city")
	private WebElement city;
	@FindBy(name = "zipcode")
	private WebElement zipCode;
	@FindBy(xpath = "(//button[contains(text(),'Save')])[3]")
	private WebElement btnSave;

	@FindBy(id = "payment_type")
	private WebElement selectPayment;
	@FindBy(xpath = "\"//label[@for=\\\"visa_card\\\"]\"")
	private WebElement visaCard;
	@FindBy(name = "card_no")
	private WebElement cardNo;
	@FindBy(name = "month")
	private WebElement month;
	@FindBy(name = "year")
	private WebElement year;
	@FindBy(name = "cvv")
	private WebElement cvv;
	@FindBy(id = "placeOrder")
	private WebElement btnPlaceOrder;

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getAddressType() {
		return addressType;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getHouseNo() {
		return houseNo;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public WebElement getSelectPayment() {
		return selectPayment;
	}

	public WebElement getVisaCard() {
		return visaCard;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public void MyCart(String addressTypeValue, String firstNameValue, String lastNameValue, String mobile,
			String house, String addressValue, String stateValue, String cityValue, String zip, String cardType,
			String cardNumber, String expMonth, String expYear, String cvvValue) {

		addAddress.click();
		selectDropdownText(addAddress, addressTypeValue);
		elementSendKeys(firstName, firstNameValue);
		elementSendKeys(lastName, lastNameValue);
		elementSendKeys(mobileNumber, mobile);
		elementSendKeys(houseNo, house);
		elementSendKeys(address, addressValue);
		selectDropdownText(state, stateValue);
		selectDropdownText(city, cityValue);
		elementSendKeys(zipCode, zip);
		elementClick(btnSave);
		selectDropdownText(selectPayment, cardType);
		elementClick(visaCard);
		elementSendKeys(cardNo, cardNumber);
		selectDropdownText(month, expMonth);
		selectDropdownText(year, expYear);
		elementSendKeys(cvv, cvvValue);
		elementClick(btnPlaceOrder);
	}
}
