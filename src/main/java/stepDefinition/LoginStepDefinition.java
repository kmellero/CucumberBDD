package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	public static String email = "ktm000@yahoo.com";
	public static String pwd = "Dzikakaczka00";
	
	@Given("^User is already on Login Page$")
	public void user_alread_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kajetanmellerowicz\\WebDrivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.norwegian.com/se/");
		WebElement inloggingTab = driver.findElement(By.xpath("//a[@class='page-header__profile__trigger']"));
		inloggingTab.click();
	}
	
	
@When("^title of login page contains Mina resor$")
public void title_of_login_page_contains_Mina_resor_Norwegian() throws InterruptedException {
	String titlep = driver.getTitle();
	Thread.sleep(3000);
	System.out.println("title page is "+titlep);
	Assert.assertEquals("this is not the page", "Mina resor | Norwegian", titlep);
}

@Then("^user enters username and user enters password$")
public void user_enters_username_and_user_enters_password()  {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email); 
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button() throws InterruptedException  {
	WebElement logButton = driver.findElement(By.xpath("//button[contains(text(),'Logga in')]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", logButton);
//	driver.findElement(By.xpath("//button[contains(text(),'Logga in')]")).click();
	Thread.sleep(3000);
}

@Then("^user is on home page$")
public void user_is_on_home_page() {
	WebElement emailA = driver.findElement(By.xpath("//span[contains(text(),'"+email+"')]"));
	System.out.println("username text is "+emailA.getText());
	Assert.assertEquals("this is not the Home Page", email, emailA.getText());
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
