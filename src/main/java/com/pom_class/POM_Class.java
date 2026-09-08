package com.pom_class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class {
	
public WebDriver driver;
	
	public POM_Class(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='large-10 columns']")
	public List < WebElement> beforeText;
	
	@FindBy(xpath="//a[text()='click here']")
	public WebElement button;
	
	@FindBy(xpath="//div[@class='large-10 columns']")
	public List <WebElement> aftert;
	
	@FindBy(xpath="//a[text()='Dynamic Content']")
	public WebElement content;
	
	@FindBy(xpath="//a[text()='Dynamic Controls']")
	public WebElement dynamicControls;
	
	@FindBy(xpath="//div[text()=' A checkbox']")
	public WebElement checkBox;
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeButton;
	
	@FindBy(xpath="//p[@id='message']")
	public WebElement message;
	
	@FindBy(xpath="//button[text()='Add']")
	public WebElement addButton;
	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;
//	
//	@FindBy(xpath="")
//	public WebElement w;

}
