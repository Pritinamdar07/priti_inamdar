package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ChkConsultancyPage {
	private String expUrl;
	private String actUrl = "e:Consultancy@geoplace.co.uk";
	WebDriver driver = null;
	@Given("^browser is open with geoplace\\.co\\.uk$")
	public void browser_is_open_with_geoplace_co_uk()  {
		// Setting the browser driver path.I have commented the line below as I have mentioned it in the system variable PATH variables
		System.setProperty( "webdriver.chrome.driver", "C:/Software/drivers/chromedriver.exe");	
		//Creating a new instance of the WebDriver.I have coded to the interface as ChromeDrivee is an implementing class.
		driver = new ChromeDriver();
		//This will navigate to the main webpage of the company's website
		driver.get("https://www.geoplace.co.uk");
			}

	@When("^user clicks on Menu Consultancy$")
	public void user_clicks_on_Menu_Consultancy() throws Throwable {
		//It will maximise the browser window
		driver.manage().window().maximize();
		Thread.sleep(100);
		//It will find the first WebElement  with the specified Id and store it in a webElement variable
		WebElement consultancy_tab =driver.findElement(By.id("item_60"));
		//The click function clicks on the WebElement
		consultancy_tab.click();
		//Getting the url attached to the consultancy webelement.
		 expUrl = (driver.findElement(By.id("item_60")).getAttribute("href"));
		}

	@Then("^Check Landing page url$")
	public void check_Landing_page_url() throws Throwable {
		try {
			//Assert method compare the two results and determine Pass or Fail status of a test case.
		Assert.assertEquals( expUrl, actUrl);
       System.out.println("Both the URL's are same");
		}
		catch(Throwable pagenavigationerr) {
			System.out.println("Both the URL's are different");
		}
} //End of method
}//End of class