package com.Expedia.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Expedia.bases.TestBase;

public class ExpediaIndex extends TestBase {
	
	public ExpediaIndex() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static int timeouts = 20;

	// Web Browser

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void waitForIEBrowser(int Timeouts) {
		try {
			Thread.sleep(Timeouts);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Web Element
		public void clickToElement(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			element.click();
		}

		public void clickToElement(String locator, String value) {
			String dynamicLocator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			element.click();
		}

		public void clickToElement(String locator, String value1, String value2) {
			String dynamicLocator = String.format(locator, value1, value2);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			element.click();
		}

		public String getTextElement(String locator, String value) {
			String dynamicLocator = String.format(locator, value);
			return getTextElement(dynamicLocator);
		}

		// Clear and sendkey
		public void sendKeyToElement(String locator, String value) {
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(value);
		}

		public void clearAndSendKeyToElementDynamicTextbox(String locator, String value, String text) {
			locator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(text);
		}

		public void clearAndSendKeyPressToElementDynamicTextbox(String locator, String value,
				Keys key) {
			locator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(key);
		}

		public void sendKeyToElementDynamicTextbox(String locator, String value, String text) {
			locator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(locator));
			element.sendKeys(text);
		}

		public void sendKeyToElement2(String locator, String value) {
			WebElement element = driver.findElement(By.xpath(locator));
			element.sendKeys(value);
		}

		public void selectItemInDropdown(String locator, String value) {
			Select element = new Select(driver.findElement(By.xpath(locator)));
			element.selectByVisibleText(value);
		}

		public void selectItemInDynamicDropdown(String locator, String value, String valueDropdown) {
			locator = String.format(locator, value);
			Select element = new Select(driver.findElement(By.xpath(locator)));
			element.selectByVisibleText(valueDropdown);
		}

		public void selectItemInDropdownSpecial(String locatorDropdown, String locator, String value) {
			WebElement dropdown = driver.findElement(By.xpath(locatorDropdown));
			dropdown.click();
			List<WebElement> list = driver.findElements(By.xpath(locator));
			System.out.println(list);
			for (WebElement element : list) {
				if (element.getText().contains(value)) {
					System.out.println(element);
					element.click();
					break;
				}
			}

		}

		public String getFirstItemSelected(String locator) {
			Select element = new Select(driver.findElement(By.xpath(locator)));
			return element.getFirstSelectedOption().getText();
		}

		public String getAtribute(String locator, String attribute) {
			WebElement element = driver.findElement(By.xpath(locator));
			return element.getAttribute(attribute);
		}

		public String getTextElement(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			return element.getText();
		}

		public String getTextDynamicElement(String locator, String value) {
			locator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(locator));
			return element.getText();
		}

		public int getSize(String locator) {
			List<WebElement> element = driver.findElements(By.xpath(locator));
			return element.size();
		}

		public void uncheckTheCheckbox(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			if (element.isSelected())
				element.click();
		}

		public boolean isControlDisplayed(String locator, String value) {
			String dynamicLocator = String.format(locator, value);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			return element.isDisplayed();
		}

		public boolean isControlDisplayed(String locator, String value1, String value2) {
			String dynamicLocator = String.format(locator, value1, value2);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			return element.isDisplayed();
		}

		public boolean isControlDisplayed(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			return element.isDisplayed();
		}

		public boolean isControlSelected(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			return element.isSelected();
		}

		public boolean isControlEnabled(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			return element.isEnabled();
		}
		
		// Iframe
		public void switchToIframe(String locator) {
			WebElement iframe = driver.findElement(By.xpath(locator));
			driver.switchTo().frame(iframe);
		}

		public void switchToDefaultContent(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
		// Actions
		public void doubleClick(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
		}

		public void hoverMouse(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}

		public void hoverMouse(String locator, String value1, String value2) {
			String dynamicLocator = String.format(locator, value1, value2);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}

		public void rightClick(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.contextClick(element).perform();
		}

		public void dragAndDrop(String locatorFrom, String locatorTarget) {
			WebElement dragFrom = driver.findElement(By.xpath(locatorFrom));
			WebElement target = driver.findElement(By.xpath(locatorTarget));
			Actions builder = new Actions(driver);
			Action dragAndDropAction = builder.clickAndHold(dragFrom).moveToElement(target).release(target).build();
			dragAndDropAction.perform();
		}
		
		// Key Press
		public void keyDownElement(String locator, Keys pressKeyDown) {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.keyDown(element, pressKeyDown);
		}

		public void keyUpElement(String locator, Keys pressKeyUp) {
			WebElement element = driver.findElement(By.xpath(locator));
			Actions action = new Actions(driver);
			action.keyUp(element, pressKeyUp);
		}

		public void sendKeyPress(String locator, Keys key) {
			WebElement element = driver.findElement(By.xpath(locator));
			element.sendKeys(key);
		}

		public void clearAndSendKeyPress(String locator, Keys key) {
			WebElement element = driver.findElement(By.xpath(locator));
			element.clear();
			element.sendKeys(key);
		}

		// Javascript
		public Object executeJavascriptToBrowser(String javaSript) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return js.executeScript(javaSript);
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}

		public Object executeJavascriptToElement(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return js.executeScript("arguments[0].click();", element);
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}

		public Object executeJavascriptToElement(String locator, String value1, String value2) {
			String dynamicLocator = String.format(locator, value1, value2);
			WebElement element = driver.findElement(By.xpath(dynamicLocator));
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return js.executeScript("arguments[0].click();", element);
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}

		public Object scrollToBottomPage(WebDriver driver) {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}

		public Object scrollToElement(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return js.executeScript("arguments[0].scrollIntoView(true);", element);
			} catch (Exception e) {
				e.getMessage();
				return null;
			}
		}
		
		public void highlightElement(String locator) {
			WebElement element = driver.findElement(By.xpath(locator));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='6px groove red'", element);
		}

		
		// Wait
		public void waitForControlPresence(String locator) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(locator);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}

		public void waitForControlVisible(String locator) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}

		public void waitForIframeVisible(String locator) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(locator);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
		}

		public void waitForControlVisible(String locator, String value) {
			String dynamicLocator = String.format(locator, value);
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(dynamicLocator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}

		public void waitForControlVisible(String locator, String value1, String value2) {
			String dynamicLocator = String.format(locator, value1, value2);
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(dynamicLocator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}

		public void waitForControlClickable(String locator) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(locator);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		}

		public void waitForControlInvisible(String locator) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			By by = By.xpath(locator);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		}

		public void waitForAlertPresence(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, timeouts);
			wait.until(ExpectedConditions.alertIsPresent());
		}



}
