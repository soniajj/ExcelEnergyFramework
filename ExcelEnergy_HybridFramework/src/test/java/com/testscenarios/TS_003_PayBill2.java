package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_003_PayBill2 extends ReusableFunctions {

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
		clickByAnyLocator(loc.Find_A_Pay_Hyperlink);
		Thread.sleep(3000);
        clickByAnyLocator(loc.State_Name_Hyperlink);
		Thread.sleep(5000);
		sendKeysByAnyLocator(loc.State_city_zipCode_box, "Zipcode");
		clickByAnyLocator(loc.Search_Box);
		clickByAnyLocator(loc.Map_button);
		
		
	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("TS_003_PayBill2 ");
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
