package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {

	public final By signIN_From = By.xpath("//a[text()='Sign In']");
	public final By userName_box = By.name("username");
	public final By password_box = By.name("password");
	public final By sign_In_button = By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/div[9]/input");
	
	public final By Username_errorMassage_From = By.id("error-form-email");	
	public final By Password_errorMassage_From = By.id("error-form-missing-password");	
	
	
	public final By PayBill_Menu_Hyperlink = By.xpath("//a[text()='Pay Bill']");
	public final By WaystoPay_Hyperlink = By.xpath("//a[text()='Ways to Pay']");
	public final By EZ_Pay_Hyperlink = By.xpath("//a[text()='Go to KUBRA EZ-PAY']");
	public final By AccountNo_Editbox = By.id("ctl00_BodyPlaceholder_ACCNO");
	public final By LookUp_Button = By.id("ctl00_BodyPlaceholder_btnLookUp");
	public final By lookupPage_validationMessage = By.id("ctl00_BodyPlaceholder_vsOTPValidations");

	
	
	

	
}
