package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	
public class LoginTest {
	
	ChromeDriver driver;
	@Given("launch chromeBrowser and load url")
	public void launchChromeBrowserAndLoadUrl() {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

	@Given("enter userName as DemoSalesManager")
	public void enterUserNameAsDemoSalesManager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("enter password as crmsfa")
	public void enterPasswordAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();  
	}

	@Then("it is navigated homepage")
	public void itIsNavigatedHomepage() {
		System.out.println("url is = "+driver.getTitle());
	}

	@Then("click the logout button")
	public void clickTheLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("close browser")
	public void closeBrowser() {
	    driver.close();
	}

	@Given("enter userName as Mamun")
	public void enterUserNameAsMamun() {
		driver.findElementById("username").sendKeys("Mamun");
	}

	@Then("it is navigated samepage")
	public void itIsNavigatedSamepage() {
		System.out.println("url is = "+driver.getTitle());
	}

	@Then("verify error massage")
	public void verifyErrorMassage() {
	    String text = driver.findElementById("errorDiv").getText();
	    if(text.contains("The Following Errors Occurred:")) {
	    	System.out.println("Text is mached");
	    
	    }else {
	    	System.out.println("Text is not mached");
	    }
	    
	}
	
}
