package com.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
protected static WebDriver driver;

	
	public static WebDriver browserLaunch() {
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumaravel\\Desktop\\Eclipse\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			System.out.println("Browser Launched");
		}catch(Exception e){
			e.getMessage();
			System.out.println("Browser Not Launched");
			
		}
		return driver;
	}

	public static void maximize() {
		
		try {
			
			driver.manage().window().maximize();
			System.out.println("Window maximized");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Browser Not Launched");
		}
	}
		public static void loadUrl(String value) {
		driver.get(value);
		
		}
		
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		public static void fill(WebElement ele,String value) {
			ele.sendKeys(value);
			
			
			
		}
		
		public void selectValueByText(WebElement ele,String name) {
			new Select(ele).selectByVisibleText(name);
			

		}
		
		public void selectValuebyIndex(WebElement ele, Integer in) {
			new Select(ele).selectByIndex(in);
			
			

		}
		
		public String getTextByAttribute(WebElement ele) {
			return ele.getAttribute("value");
			
			
		}
		
		public void typejs(WebElement ele,String name) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setattribute('value''"+ name +"')", ele);
			
			
		}
		
		public static  String getRandomData() {
		return new SimpleDateFormat("EEE_MMM_dd_hhmmss_zzz_yyyy").format(new Date());
			
		}
		
		public static   void screenShot() {
			TakesScreenshot tk = (TakesScreenshot)driver;
			File s = tk.getScreenshotAs(OutputType.FILE);
			File d = new File("C:\\Users\\kumaravel\\Desktop\\Eclipse\\Cucumber\\Screenshot"+ getRandomData() +".png");
			try {
				
				FileUtils.copyFile(s, d);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void click(WebElement ele) {
			ele.click();
			
		}
		
	}


