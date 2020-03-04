package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotel extends LibGlobal {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement HType;
	
	@FindBy(id="room_nos")
	private WebElement Rooms;
	
	@FindBy(id="datepick_in")
	private WebElement CIDate;
	
	@FindBy(id="datepick_out")
	private WebElement CODate;
	
	@FindBy(id="adult_room")
	private WebElement APR;
	
	@FindBy(id="child_room")
	private WebElement CPR;
	
	@FindBy(id="Submit")
	private WebElement Search;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getHType() {
		return HType;
	}

	public WebElement getRooms() {
		return Rooms;
	}

	public WebElement getCIDate() {
		return CIDate;
	}

	public WebElement getCODate() {
		return CODate;
	}

	public WebElement getAPR() {
		return APR;
	}

	public WebElement getCPR() {
		return CPR;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	
	
	
	
	
	
	
	
	
	

}
