package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_002_PayBill extends ReusableFunctions {

	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
	public void TS_001_Login_InvalidTestData() throws Exception {

		getURL("ExcelEnergy_URL");
		Thread.sleep(6000);
		clickByAnyLocator(loc.PayBill_Menu_Hyperlink);
		scrollIntoView(loc.WaystoPay_Hyperlink); 
		clickUsingJavaScript(loc.WaystoPay_Hyperlink);
		clickByAnyLocator(loc.EZ_Pay_Hyperlink);
		switchToNewTab();
		sendKeysByAnyLocator(loc.AccountNo_Editbox, "AccountNo");
		clickByAnyLocator(loc.LookUp_Button);
		getTextFromElement(loc.lookupPage_validationMessage);
		
	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("TS_002_PayBill");
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
