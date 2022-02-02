package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	
	WebDriver driver;
	
	
	@Given("browser is launched")
	public void browser_is_launched() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("url is opened")
	public void url_is_opened() {
	  driver.get("https://www.facebook.com/");
	}

	@When("user has entered the userid as {string}")
	public void user_has_entered_the_userid_as(String userid) {
	   driver.findElement(By.id("email")).sendKeys(userid);
	}

	@When("user has entered the password as {string}")
	public void user_has_entered_the_password_as(String password) {
		 driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("user has clicked on login button")
	public void user_has_clicked_on_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@Then("the home page should be displayed")
	public void the_home_page_should_be_displayed() {
	  System.out.println("Home page is displayed .............................");
	}

}
