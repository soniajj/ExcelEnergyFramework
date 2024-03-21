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
	public void tc_003_PayBill2() throws Exception {

		getURL("ExcelEnergy_URL");
		Thread.sleep(6000);
		clickByAnyLocator(loc.PayBill_Menu_Hyperlink);
		scrollIntoView(loc.WaystoPay_Hyperlink); 
		clickUsingJavaScript(loc.WaystoPay_Hyperlink);
		clickByAnyLocator(loc.Find_A_Pay_Hyperlink);
		Thread.sleep(5000);
		clickByAnyLocator(loc.Minnesota_stateName);
		Thread.sleep(5000);
		scrollToXY(loc.State_city_zipCode_box);
		sendKeysByAnyLocator(loc.State_city_zipCode_box, "Zipcode");
		scrollToXY(loc.Search_Box);
		clickByAnyLocator(loc.Search_Box);
		Thread.sleep(5000);
		takeScreenshot("TS_003_PayBill2_searchResults ");	
		clickByAnyLocator(loc.Map_button);
		
		
	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("TS_003_PayBill2 ");
	}

	//@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
