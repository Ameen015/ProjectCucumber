package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

import com.base.LibGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends LibGlobal {
	WebDriver driver;
	@Given("User in on the Adactin Hotel App page")
	public void user_in_on_the_Adactin_Hotel_App_page() {
		driver = browserLaunch();
		  driver.get("https://www.adactin.com/HotelApp/");
		  maximize();
	}

	@When("User enters the {string},{string} and click Login button")
	public void user_enters_the_and_click_Login_button(String s1, String s2) {
		
		LoginPage LP = new LoginPage(); 
		WebElement UserName = LP.getUserName();
		UserName.sendKeys(s1);
		Assert.assertEquals("verify username", s1,getTextByAttribute(UserName));
		
		WebElement Password = LP.getPassword();
		Password.sendKeys(s2);
		screenShot();
		Assert.assertEquals("verify username", s2,getTextByAttribute(Password));
		WebElement Login = LP.getLogin();
		click(Login);
	    
	}

	@When("After Login User search the hotel, with {string},{string} and click search button")
	public void after_Login_User_search_the_hotel_with_and_click_search_button(String s3, String s4) {

		SearchHotel SH = new SearchHotel(); 
		
		    WebElement Location = SH.getLocation();
		    click(Location);
		    selectValuebyIndex(Location, 2);
		
		    WebElement Hotels = SH.getHotels();
		    click(Hotels);
		    selectValuebyIndex(Hotels, 2);
		    
		    WebElement HType = SH.getHType();
		    click(HType);
		    selectValuebyIndex(HType, 1);
		    
		    WebElement Rooms = SH.getRooms();
		    click(Rooms);
		    selectValuebyIndex(Rooms, 1);
		    
		    WebElement CIDate = SH.getCIDate();
			CIDate.clear();
			CIDate.sendKeys(s3);
			String date = CIDate.getAttribute("value");
			Assert.assertEquals("verify CID", s3, date);
			
			WebElement CODate = SH.getCODate();
			CODate.clear();
			CODate.sendKeys(s4);
			Assert.assertEquals("verify COD", s4, getTextByAttribute(CODate));
			
			WebElement APR = SH.getAPR();
		    click(APR);
		    selectValuebyIndex(APR, 2);
		    
		    WebElement CPR = SH.getCPR();
		    click(CPR);
		    selectValuebyIndex(CPR, 1);
		    
		    WebElement Search = SH.getSearch();
		    click(Search);
			   
		
		
	}

	@When("User Should select the Hotel")
	public void user_Should_select_the_Hotel() {
	    SelectHotel SH1 = new SelectHotel();
	    WebElement Htype = SH1.getHtype();
	    click(Htype);
	    
	    WebElement Continue = SH1.getContinue();
	    click(Continue);
	}

	@When("User enter {string},{string},{string}{string}{string} and Book the hotel")
	public void user_enter_and_Book_the_hotel(String s5, String s6, String s7, String s8, String s9) {
		BookHotel BH = new BookHotel();
		
		WebElement FirstName = BH.getFirstName();
		FirstName.sendKeys(s5);
		Assert.assertEquals("verify CID", s5, getTextByAttribute(FirstName));
		
		WebElement LastName = BH.getLastName();
		LastName.sendKeys(s6);
		Assert.assertEquals("verify lname", s6, getTextByAttribute(LastName));
		
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys(s7);
		Assert.assertEquals("verify Add", s7, getTextByAttribute(Address));
		
		WebElement CDno = BH.getCDno();
		CDno.sendKeys(s8);
		Assert.assertEquals("verify CDno", s8, getTextByAttribute(CDno));
		
		WebElement CC = BH.getCC();
	    click(CC);
	    selectValuebyIndex(CC, 1);
	    
	    WebElement Emonth = BH.getEmonth();
		click(Emonth);
	    selectValueByText(Emonth, "March");
	    
	    WebElement Eyear = BH.getEyear();
		click(Eyear);
		selectValueByText(Eyear, "2022");
		
		WebElement CVV = BH.getCVV();
		CVV.sendKeys(s9);
		String cv = CVV.getAttribute("value");
		Assert.assertEquals("verify CVV", s9, cv);
		
		WebElement Book = BH.getBook();
		click(Book);
		
		 
	}	

	@Then("User get the orderno print")
	public void user_get_the_orderno_print() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement Order = driver.findElement(By.id("order_no"));
		String orderno = Order.getAttribute("value");
		System.out.println(orderno);
	
		
		WebElement Itenary = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		Itenary.click();
		Thread.sleep(5000);
		
		WebElement BI = driver.findElement(By.xpath("//input[@value ='"+ orderno +"']/parent::td/preceding-sibling::td"));
        BI.click();
        
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
        
        Thread.sleep(3000);;
        Alert a = driver.switchTo().alert();
        a.accept();
		
		
		
	   
	}

}
