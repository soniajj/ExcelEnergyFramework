package com.testscenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_001_Login_InvalidTestData extends ReusableFunctions {
	
	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
  public void TS_001_Login_InvalidTestData() throws Exception {
		
	  getURL("ExcelEnergy_URL");
	  Thread.sleep(6000);
	  clickByAnyLocator(loc.signIN_From);
takeScreenshot("Sign_In_screen");
clickByAnyLocator(loc.sign_In_button);
takeScreenshot("error_In_screen");
getTextFromElement(loc.Username_errorMassage_From);
getTextFromElement(loc.Password_errorMassage_From);
refreshCurrentPage();
Thread.sleep(10000);
sendKeysByAnyLocator(loc.userName_box, "Invalid_Username");
sendKeysByAnyLocator(loc.password_box, "Invalid_Password");
clickByAnyLocator(loc.sign_In_button);
takeScreenshot("error_In_screen");
	}

	
	

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("TS_001_Login_InvalidTestData");
	}

	
	@AfterClass
	public void closeTheBrowser() {
	driver.quit();
	}
  }
