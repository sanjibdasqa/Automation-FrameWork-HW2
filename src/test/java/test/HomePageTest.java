package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	/*
	 * @Test public void clickEmailButtonTest() throws InterruptedException {
	 * homePage.clickEmailButton(); }
	 */

	@Test(enabled = false, priority = 1)
	public void clickEmailButtonTest() throws InterruptedException {
		homePage.clickEmailButton();
	}

	@Test(enabled = false, priority = 2)
	public void inputTextEmailTest() throws InterruptedException {
		homePage.inputTextEmail();
	}

	@Test(enabled = false, priority = 3)
	public void clickPasswordTest() {
		driver.findElement(By.cssSelector("input.form-input-label__input.form-input-password__input")).click();
	}

	@Test(enabled = false, priority = 4)
	public void inputTextPasswordTest() throws InterruptedException {
		homePage.inputTextPassword();
	}

	@Test(enabled = false, priority = 5)
	public void clickForgotYourPasswordTest() throws InterruptedException {
		homePage.clickForgotYourPassword();
	}

	@Test(enabled = false, priority = 6)
	public void zaraLogoTest() {
		homePage.logoDisplayed();
	}

}
