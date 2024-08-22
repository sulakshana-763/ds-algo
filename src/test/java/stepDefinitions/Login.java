package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public static WebDriver driver;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	       
	}

	@When("User opens URL {string}")
	public void user_opens_url(String appname) {
	    driver.get("https://dsportalapp.herokuapp.com/home");
	    
	}

	@When("Click on Sign in")
	public void click_on_sign_in() {
	    driver.findElement(By.xpath( "//a[text()= 'Sign in']"));	    
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	   driver.findElement(By.id("id_username")).sendKeys("techtitans"); 
	   driver.findElement(By.id("id_password")).sendKeys("Time2fly$");
	    
	}

	@When("Click on Login")
	public void click_on_login() {
	    driver.findElement(By.xpath( "//input[@type='submit']"));
	    
	}

	@Then("User can view the Numpy Ninja Homepage")
	public void user_can_view_the_numpy_ninja_homepage() {
	    
	    
	}


}


