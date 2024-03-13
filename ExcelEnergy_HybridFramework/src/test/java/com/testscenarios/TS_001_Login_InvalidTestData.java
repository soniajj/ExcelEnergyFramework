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
	  clickByAnyLocator(loc.signIN_From);
	

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
