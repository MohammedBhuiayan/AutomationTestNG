package com.infosysAmex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class codeTest {

	WebDriver driver;
		@BeforeTest
		@Parameters("browserName")
		public void setBrowser(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mohammed.bhuiayan\\eclipse-workspace\\LearnSelenium\\AllDrivers\\chromedriver_win32\\chromedriver.exe");
		 		driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.drider", 
						"C:\\Users\\mohammed.bhuiayan\\eclipse-workspace\\Automation\\All_Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
			
			@Test
		public void openGoogle() {
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com");
			}
			
			@Test
		public void sendText() {	
		 WebElement sb =  driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		 sb.sendKeys("American Express");
		 sb.click();
		}
	
}
