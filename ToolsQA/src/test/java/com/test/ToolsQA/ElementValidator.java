package com.test.ToolsQA;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.ToolsQA.pageObjectModel.ElementsPom;

public class ElementValidator extends Config {

	public WebDriver driver;
	ElementsPom elementsPom;

	@BeforeTest
	public void getdriver() throws IOException {
		initiateWebdriver();
		driver = getInitiatedDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		elementsPom = new ElementsPom(driver);
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

	@Test(dependsOnMethods = "validtaeCheckBox")
	public void openElementView() {
		elementsPom.getElement().click();
	}

	@Test(enabled = false)
	public void validateTextBox() throws InterruptedException {
		elementsPom.getTextBox().click();
		elementsPom.getUsername().sendKeys("Niyati");
		elementsPom.getEmail().sendKeys("Niyati@gmail.com");
		elementsPom.getCurrentAddress().sendKeys("current address");
		elementsPom.getParmanentAddress().sendKeys("parmanent address");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//button[@id='submit']"))).click();
		 */
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", elementsPom.getSubmit());
		Assert.assertEquals(elementsPom.getName().getText(), "Name:Niyati");
	}

	@Test(enabled = false)
	public void validateCheckBox() {
		elementsPom.getElement().click();
		elementsPom.getMainChekBox().click();
		elementsPom.getHome().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", elementsPom.getexpand());
		jse.executeScript("arguments[0].click()", elementsPom.getGeneral());
		jse.executeScript("arguments[0].click()", elementsPom.getExcel());
		Assert.assertEquals(elementsPom.getresultGeneral().getText() + " " + elementsPom.getresultExcel().getText(),
				"general " + "excelFile");
	}

}
