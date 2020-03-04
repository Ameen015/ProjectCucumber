package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

public class BookHotel extends LibGlobal{

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CDno;
	
	@FindBy(id="cc_type")
	private WebElement CC;
	
	@FindBy(id="cc_exp_month")
	private WebElement Emonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Eyear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement Book;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCDno() {
		return CDno;
	}

	public WebElement getCC() {
		return CC;
	}

	public WebElement getEmonth() {
		return Emonth;
	}

	public WebElement getEyear() {
		return Eyear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBook() {
		return Book;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

