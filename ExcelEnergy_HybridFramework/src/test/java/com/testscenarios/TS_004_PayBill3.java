package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_004_PayBill3 extends ReusableFunctions {

	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
	public void tc_004_PayBill3() throws Exception {

		getURL("ExcelEnergy_URL");
		Thread.sleep(6000);
		clickByAnyLocator(loc.PayBill_Menu_Hyperlink);
		scrollIntoView(loc.WaystoPay_Hyperlink); 
		clickUsingJavaScript(loc.WaystoPay_Hyperlink);
		clickByAnyLocator(loc.Enroll_Auto_Pay_Hyperlink);
		Thread.sleep(3000);
		getTextFromElement(loc.Sign_In_Page_validation);
		
	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("TS_004_PayBill3 ");
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
