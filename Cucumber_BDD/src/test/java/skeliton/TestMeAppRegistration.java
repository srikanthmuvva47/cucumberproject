package skeliton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeAppRegistration {
	WebDriver driver;
	@Given("The url of the TestMeApp {string}")
	public void the_url_of_the_TestMeApp(String url) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("user clicks SignUp button")
	public void user_clicks_SignUp_button() {
	    driver.findElement(By.xpath(" //a[contains(text(),'SignUp')]")).click();
	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String username) {
	    driver.findElement(By.id("userName")).sendKeys("srikanth");
	}

	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys("srikanth");
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys("muvva");
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String password) {
		driver.findElement(By.id("password")).sendKeys("sri123");
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("sri123");
	}

	@When("user enters {string} as gender")
	public void user_enters_as_gender(String gender) {
		driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();;
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String email) {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("sri@gmail.com");
	}

	@When("user enters {string} as mobilenumber")
	public void user_enters_as_mobilenumber(String mobilenumber) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("76354263");
	}

	@When("user enters {string} as dateofbirth")
	public void user_enters_as_dateofbirth(String dateofbirth) {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/09/1997");
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String address) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Duddukuru");
	}

	@When("user enters {string} as securityquestion")
	public void user_enters_as_securityquestion(String sequrityquestion) {
		WebElement sq=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select q=new Select(sq);
		q.selectByValue("411010");
	}

	@When("user enters {string} as answer")
	public void user_enters_as_answer(String answer) {
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("srikanth");
	}

	@When("user clicks Register button")
	public void user_clicks_Register_button() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("user is in valid page")
	public void user_is_in_valid_page() {
		 Assert.assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		
	}
	@When("User clicks SignIn button")
	public void user_clicks_SignIn_button() {
	    driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}
	@When("user clicks Login button")
	public void user_clicks_Login_button() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	}
	@When("user search for product {string}")
	public void user_search_for_product(String string) {
		driver.findElement(By.xpath(" //input[@id='myInput']")).sendKeys("Headphone");
	}
	@When("user clicks FindDetails")
	public void user_clicks_FindDetails() {
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@When("user clicks addtocart")
	public void user_clicks_addtocart() {
		driver.findElement(By.xpath(" //a[@class='btn btn-success btn-product']")).click();
	}


}
