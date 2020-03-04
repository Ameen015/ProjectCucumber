package org.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotel extends LibGlobal {
	public SelectHotel() {
			PageFactory.initElements(driver, this);
		}

	@FindBy(id="radiobutton_0")
	private WebElement Htype;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getHtype() {
		return Htype;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	
	
	
}


