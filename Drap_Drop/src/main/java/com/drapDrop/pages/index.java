package com.drapDrop.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.drapDrop.bases.TestBase;

public class index extends TestBase {
	

	public index() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static String getTitlePage() {
		return driver.getTitle();
	}
	
	public static void ClickDropLink(String locator) {
//		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		WebElement drop = driver.findElement(By.xpath(locator));
		drop.click();
//		javascript.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",drop);
	}
	
	public static void drapanddrop(String locator1, String locator2, String locator3) {
		
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator1)));
		List<WebElement> list = driver.findElements(By.xpath(locator1));
		System.out.println("No. of Irame: " + list.size());
		driver.switchTo().frame(0);
//		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebElement srcElement = driver.findElement(By.xpath(locator2));
//		javascript.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",srcElement);
		WebElement targetElement = driver.findElement(By.xpath(locator3));
//		javascript.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
//				targetElement);
		Action dragAndDrop = actions.clickAndHold(srcElement).moveToElement(targetElement).release(targetElement).build();
		dragAndDrop.perform();
//		javascript.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
//				dragAndDrop);
	}
	
	public static void CloseDriver() {
		driver.close();
	}

}
