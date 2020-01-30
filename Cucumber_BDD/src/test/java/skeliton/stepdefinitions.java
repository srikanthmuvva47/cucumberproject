package skeliton;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdefinitions {
	Person Shan=new Person();
	@Given("Shan is {int} meters away from Lucia")
	public void shan_is_meters_away_from_Lucia(Integer int1) {
	  Shan.setDistance(int1);
	}

	@When("shan shouts {string}")
	public void shan_shouts(String string) {
	   Shan.setMessage(string);
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string) {
	   String message= Shan.getMessage();
	   Assert.assertEquals("Free Coffee",message);

	}

	@Then("Lucia hears No Message")
	public void lucia_hears_No_Message() {
		 String message= Shan.getMessage();
		   Assert.assertEquals(null,message);
}



}
