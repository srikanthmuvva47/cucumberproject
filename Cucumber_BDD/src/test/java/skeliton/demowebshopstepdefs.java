package skeliton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class demowebshopstepdefs {
	WebDriver driver;
	public demowebshopstepdefs() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,DemoWebShopLoginPage.class);
		
	}
	@Given("The url of the Demo Web Shop {string}")
	public void the_url_of_the_Demo_Web_Shop(String url) {
	   
	    System.setProperty("webdriver.chrome.driver","src/test/resources/resources/chromedriver.exe");
	   
	    driver.get(url);
	   
	}

	@When("User enters {string}")
	public void user_enters(String username) {
	    DemoWebShopLoginPage.email.sendKeys(username);
	}

	@When("User entere {string} as password")
	public void user_entere_as_password(String password) {
		DemoWebShopLoginPage.password.sendKeys(password);
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
	   DemoWebShopLoginPage.Login.click();
	}

	@Then("User is in valid page")
	public void user_is_in_valid_page() {
	    Assert.assertTrue(DemoWebShopLoginPage.Logout.isDisplayed());
	    DemoWebShopLoginPage.Logout.click();
	}




}
