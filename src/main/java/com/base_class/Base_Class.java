package com.base_class;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;

	public static void launch_Browser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		js = (JavascriptExecutor) driver;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
		public static void click(WebElement e) {
			wait.until(ExpectedConditions.elementToBeClickable(e));
			e.click();
		}

		public static String getUrl() {
			return driver.getCurrentUrl();
		}

		public static String getTitle() {
			return driver.getTitle();
		}

		public static void sendkeys(WebElement e, String text) {
			wait.until(ExpectedConditions.visibilityOf(e));
			e.clear();
			e.sendKeys(text);
		}

		public static void scroll(WebElement e) {
			// wait.until(ExpectedConditions.visibilityOf(e));
			js.executeScript("window.scrollBy(0,2000)", e);
		}

		public static void scrol(WebElement e) {
			wait.until(ExpectedConditions.visibilityOf(e));
			js.executeScript("arguments[0].scrollIntoView(true);", e);
			// window.scrllTo(0.1000);
		}

		public static String getText(WebElement e) {
			return e.getText();
		}

		public static void jsclick(WebElement e) {
			js.executeScript("arguments[0].click();", e);
		}

		public void Title(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			Select sc = new Select(element);
			sc.selectByVisibleText("Planned");

		}

		public void ScrollToElement(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
		}
		
		public static void back() {
			driver.navigate().back();
		}
		

}