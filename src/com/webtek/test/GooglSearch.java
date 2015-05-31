package com.webtek.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GooglSearch {

	public WebDriver driver;

	@Test
	public void searchData() {

		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement searchTextBox = driver.findElement(By.name("q"));
		WebElement clickSearchButton = driver.findElement(By.name("btnG"));

		searchTextBox.sendKeys("abcd");
		clickSearchButton.click();
	}

}
