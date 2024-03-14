package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {

	public final By signIN_From = By.xpath("//a[text()='Sign In']");
	public final By userName_box = By.name("username");
	public final By password_box = By.name("password");
	public final By sign_In_button = By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/div[9]/input");
	
	public final By Username_errorMassage_From = By.id("error-form-email");	
	public final By Password_errorMassage_From = By.id("error-form-missing-password");	
	
}
