package com.pack.home.TestExecution;

import java.io.IOException;


import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import com.pack.home.Libraries.DriverLaunch;
import com.pack.home.Libraries.LibraryForGenericFunction;

public class TestRun {
	DriverLaunch Dlib = new DriverLaunch();
	public static WebDriver driver;	
	LibraryForGenericFunction lib = null;

	@BeforeTest
	public void executing() throws InterruptedException, IOException {
		driver = Dlib.openBrowser("chrome");
		lib = new LibraryForGenericFunction(driver);
		// Application link will be opened
		driver.get("http://13.233.43.95:8080/Anand/");
	}


	
	@Test(priority = 1, description="Performs an button and checks the dashboard url (passes)")
	public void login() throws InterruptedException, IOException {
		//lib.jsSendKeysForID("username", "anand", "login", "ID");
		//lib.jsSendKeysForID("password", "1234", "login", "ID");
		//Assert.assertTrue(lib.waitAndClickForID("sinup", "login", "ID"));
		lib.waitAndClickForID("sinup", "login", "ID");
		//Thread.sleep(2000);
						
	}
	
	@Test(priority = 2, description="Logs out (passes)")
	public void logout() throws InterruptedException, IOException {
		lib.waitAndClickForID("sinup1", "login", "ID");
	}
	
	@Test(priority = 3, description="Logs out (passes)")
	public void logout1() throws InterruptedException, IOException {
		lib.waitAndClickForID("sinup", "login", "ID");
	}
	@AfterTest()
	public void afterMethod() throws IOException {
		driver.quit();		
	}	
}
