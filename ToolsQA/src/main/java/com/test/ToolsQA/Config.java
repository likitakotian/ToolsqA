package com.test.ToolsQA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {

	public WebDriver driver;
	public Properties properties;

	public void initiateWebdriver() throws IOException {
		properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(
				"/Users/sagarliki/git/ToolsqA/ToolsQA/resources/data.property");
		properties.load(fileInputStream);
		String browsername = properties.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver", "/Users/sagarliki/Downloads/chromedriver");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
		}
	}

	public WebDriver getInitiatedDriver() throws NullPointerException {
		if (driver != null) {
			return driver;
		} else {
			throw new NullPointerException("driver is null");
		}
	}

	public String getScreenshot(String destination) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(destination));
		return destination;
	}
}
