package com.test.ToolsQA.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPom {
	
 public WebDriver driver;
 
	public ElementsPom(WebDriver driver) {
		this.driver = driver;
	}
	
	private By element = By.xpath("//div[@class='container playgound-body']//div[1]//div[1]//div[1]//div[1]//span[1]//div[1]//div[2]//div[2]//*[name()='svg']");
	private By textBox = By.xpath("//span[normalize-space()='Text Box']");
	private By checkBox = By.xpath("//span[normalize-space()='Check Box']");
	private By radioButton = By.xpath("//span[normalize-space()='Radio Button']");
	private By webtable = By.xpath("//span[normalize-space()='Web Tables']");
	private By button = By.xpath("//span[normalize-space()='Buttons']");
	private By links = By.xpath("//span[normalize-space()='Links']");
	private By brokenImages = By.xpath("//span[normalize-space()='Broken Links - Images']");
	private By upload = By.xpath("//span[normalize-space()='Upload and Download']");
	private By dynamicProperty = By.xpath("//span[normalize-space()='Dynamic Properties']");
	private By username = By.xpath("//input[@id='userName']");
	private By email = By.xpath("//input[@id='userEmail']");
	private By currentAddress = By.xpath("//textarea[@id='currentAddress']");
	private By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	private By submit = By.xpath("//button[@id='submit']");
	private By name = By.xpath("//p[@id='name']");
	
	private By mainChekBox = By.xpath("//span[normalize-space()='Check Box']");
	private By home = By.xpath("//button[@title='Toggle']//*[name()='svg']");
	private By document = By.xpath("//li[2]//span[1]//button[1]//*[name()='svg']");
	private By office = By.xpath("//body//div[@id='app']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[2]//span[1]//button[1]//*[name()='svg']");
	private By general = By.xpath("//span[text()='General']");
	//private By general = By.linkText("General");
	private By download = By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']");
	private By excel = By.xpath("//span[text()='Excel File.doc']");
	private By resultGeneral = By.xpath("//span[normalize-space()='general']");
	private By resultExcel = By.xpath("//span[normalize-space()='excelFile']");
	private By expand = By.xpath("//button[@aria-label='Expand all']");
	
	
	public WebElement getElement() {
		return driver.findElement(element);
	}
	
	public WebElement getTextBox() {
		return driver.findElement(textBox);
	}
	
	public WebElement getCheckBox() {
		return driver.findElement(checkBox);
	}
	
	public WebElement getRadiobutton() {
		return driver.findElement(radioButton);
	}
	
	public WebElement getWebTable() {
		return driver.findElement(webtable);
	}
	
	public WebElement getButton() {
		return driver.findElement(button);
	}
	
	public WebElement getLinks() {
		return driver.findElement(links);
	}
	
	public WebElement getBrokenImages() {
		return driver.findElement(brokenImages);
	}
	
	public WebElement getUpload() {
		return driver.findElement(upload);
	}
	
	public WebElement getDynamicProperty() {
		return driver.findElement(dynamicProperty);
	}
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getCurrentAddress() {
		return driver.findElement(currentAddress);
	}
	
	public WebElement getParmanentAddress() {
		return driver.findElement(permanentAddress);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	
	public WebElement getName() {
		return driver.findElement(name);
	}
	
	public WebElement getMainChekBox() {
		return driver.findElement(mainChekBox);
	}
	
	public WebElement getHome() {
		return driver.findElement(home);
	}
	
	public WebElement getDocument() {
		return driver.findElement(document);
	}
	
	public WebElement getOffice() {
		return driver.findElement(office);
	}
	
	public WebElement getGeneral() {
		return driver.findElement(general);
	}
	
	public WebElement getDownload() {
		return driver.findElement(download);
	}
	
	public WebElement getExcel() {
		return driver.findElement(excel);
	}
	
	public WebElement getresultGeneral() {
		return driver.findElement(resultGeneral);
	}
	
	public WebElement getresultExcel() {
		return driver.findElement(resultExcel);
	}
	
	public WebElement getexpand() {
		return driver.findElement(expand);
	}
}
