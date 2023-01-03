package com.test.ToolsQA;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@Test
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
	
	@Test(enabled = false)
	public void validateRadioButtons() {
		elementsPom.getRadiobutton().click();
		boolean val = false;
		val = elementsPom.getradioButtons().get(0).isSelected();
		if(val) {
			elementsPom.getradioButtons().get(1).click();
			String actualText = elementsPom.getActualText().get(1).getText();
			Assert.assertEquals(actualText, elementsPom.getExpectedText().getText());
		}else {
			elementsPom.getradioButtons().get(0).click();
		}
		
	}
	
	@Test
	public void validateWebTebales() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", elementsPom.getWebTable());
		jse.executeScript("arguments[0].click()", elementsPom.getaddElement());
		jse.executeScript("arguments[0].value='nutan'", elementsPom.getaddFirstName());
		elementsPom.getaddLastName().sendKeys("malhotra");
		elementsPom.getEmail().sendKeys("nutan@gmail.com");
		elementsPom.getaddAge().sendKeys("10");
		elementsPom.getaddSalary().sendKeys("2000");
		elementsPom.getaddDepartment().sendKeys("test");
		jse.executeScript("arguments[0].dispatchEvent(new MouseEvent('dblclick', { bubbles: true }));", elementsPom.getelementSubmit());
		
		
		 //driver.navigate().refresh();
		for(int i=1; i<elementsPom.gettableRows().size();i++) {
			if(elementsPom.gettableRows().get(i).getText().contains("Cierra")) {
				assertTrue(true);
			}
		}
	}

}
