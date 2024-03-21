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
	
	public final By Find_A_Pay_Hyperlink = By.xpath("//a[text()='Find a Pay Station']");
	public final By State_Name_Hyperlink = By.xpath("//a[text()='Minnesota']");
	public final By State_city_zipCode_box = By.id("pay-station-search-15");
	public final By Search_Box = By.xpath("//*[@id=\"xeg-main\"]/div/div/div[4]/c-xe-find-a-pay-station/section/div/div[1]/div[1]/c-xe-find-a-pay-station-search/div/button");
	public final By Map_button = By.id("mapTab-12");
	

	public final By Enroll_Auto_Pay_Hyperlink = By.xpath("//a[text()='Enroll in Auto Pay Today']");
	public final By Sign_In_Page_validation = By.id("sign-in-header");
	
}
