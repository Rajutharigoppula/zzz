package zzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

public WebDriver driver;
	
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement createaccount;
	
	
	
	// operators
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//pagefactory - static class is realated selenium webdriver jars
	}
	
	public void selectcreateaccount(String x)
	{
		createaccount.click();
	}
}

