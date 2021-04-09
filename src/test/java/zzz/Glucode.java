package zzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Glucode {
	
	public WebDriver driver;
	public Homepage hp;
	public Scenario S;
	public Properties pro;
	
	@Before
	public void method(Scenario s) throws IOException
	{
		this.S = s;
		pro = new Properties();
		FileInputStream fip = new FileInputStream("src//test//resources//Features//Test.properties");
	    pro.load(fip);
	}	
	
	
	@Given("^open browser with chrome$")
	public void open_browser_with_chromme() throws InterruptedException 
	{

		String projectPath = System.getProperty("user.dir");
		System.out.println("projectpath is:" +projectPath);		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/cdriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		hp = new Homepage(driver);

		driver.get(pro.getProperty("url"));
		Thread.sleep(1000);

	}

	@Then("click on the create customer")
	public void click_on_the_create_customer() 
	{

	}

	@When("enter the input details")
	public void enter_the_input_details()
	{
	    
	}

	@And("click on submit")
	public void click_on_submit() 
	{
		
	}

}
