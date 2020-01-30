package skeliton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppLogin {
	WebDriver driver;
	@Given("The url ofthe TestMeApp {string}")
	public void the_url_ofthe_TestMeApp(String url) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}
	@When("user clicks SignIn button")
	public void user_clicks_SignIn_button() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String userName) {
		driver.findElement(By.id("userName")).sendKeys(userName);
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		 driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

	@Then("user is in validpage")
	public void user_is_in_validpage() {
		Assert.assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
}
