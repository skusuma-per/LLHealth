package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;

public class SuggestionsComponent {
	
	WebDriver driver;
	WebElement Connections;
	WebElement CurrentCompanies;
	
	WebElement search = driver.findElement(By.cssSelector("input.search-global-typeahead__input.always-show-placeholder"));
	List<WebElement> recent = driver.findElements(By.xpath("//h2[contains(text(), 'Recent')]"));

    
	@Before
	@Given("^User is on MainPage$")
	public void user_is_on_MainPage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:/Users/Jeremy Brua/Documents/Drivers/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		System.out.println("User on linkedin page");
	    throw new PendingException();
	}
	
	
	
	@When("^ClickonSearchBar \"\"$")
	public void clickonsearchbar() throws Exception
	{
		search.click();
		System.out.println("User clicked on Search Bar");
	}
	
	
	@Then("^VerifySuggestionsComponents$") 
	public void verifysuggestioncomponents() throws Exception
	{
	
		if(recent.size() >0)
		
			System.out.println("Found Suggestion Component in recent searches");
		
		else
			System.out.println("Really. No Suggestions founds");
	}
	
}
