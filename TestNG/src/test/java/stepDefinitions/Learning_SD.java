package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LetCode_Input;
import pages.LetCode_Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_SD {
	
	WebDriver driver;
	LetCode_Test LC_T;
	LetCode_Input LC_I;
	
	
	@Given("user launch browser")
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\igoku\\git\\Selenium-Cucumber-TestNG\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		System.out.println("==Launched Browser==");
	}
	
	
	@Then("user navigate to letcode website")
	public void user_nav_website() throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://letcode.in/test");
		Thread.sleep(1000);
	    System.out.println("==Login page loaded==");
	}
	
	
	@When("^user click on (.*) card$")
	public void user_nav_website(String card) throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		LC_T = new LetCode_Test(driver);
		LC_T.SwitchCard(card);
		Thread.sleep(1000);
		System.out.println("=="+card+" card loaded==");		
	}
	
	@Then("user enters data in Enter your full Name filed")
	public void user_enters_data_in_Enter_your_full_Name_filed() throws InterruptedException{
		
		LC_I = new LetCode_Input(driver);
		LC_I.entername();
		Thread.sleep(1000);
	}
	@And("user Append a text and press keyboard tab")
	public void  user_Append_text_press_keyboard_tab() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.appendMe();
		Thread.sleep(1000);
		
	}
	@And("user reads the text in the field")
	public void  user_reads_the_text_in_the_field() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.getMe();
		Thread.sleep(1000);
	}
	@And("user clears text in the field")
	public void  user_clears_text_in_the_field() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.clearMe();
		Thread.sleep(1000);
	}
	@And("user verify the input field is disabled")
	public void  user_verify_the_input_field_is_disabled() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.disableMe();
		Thread.sleep(1000);
	}
	@And("user verify the input filed is read only")
	public void  user_verify_the_input_filed_is_read_only() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.readonly();
		Thread.sleep(1000);
	}
	
	@And ("user exit browser")
	public void ExitBrowser() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
		System.out.println("==Terminated Browser==");
		
	}
	

}
