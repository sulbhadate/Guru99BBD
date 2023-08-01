package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageStepDef extends BaseClass {

	@Given("User on Register Page")
	public void user_on_register_page() {
		initiolization();

	}

	@When("User enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and_and(String fname, String lname, String email, String confemail,
			String password, String date, String month, String year, String radio) {
		RegisterPage registerpage = new RegisterPage();
		registerpage.registerPageFunctionality(fname, lname, confemail, email, password, date, month, year, radio);
	}

	@After
	public static void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		} else {

			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());

		}
	}

}
