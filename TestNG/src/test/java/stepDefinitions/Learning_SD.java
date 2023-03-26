package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LetCode_Alert;
import pages.LetCode_Button;
import pages.LetCode_Select;
import pages.LetCode_Home;
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
	LetCode_Home LC_H;
	LetCode_Button LC_B;
	LetCode_Select LC_DP;
	LetCode_Alert LC_AL;
	
	
	@Given("user launch browser")
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\igoku\\git\\Selenium-Cucumber-TestNG\\TestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		System.out.println("==Launched Browser==");
	}
	
	
	@Then("user navigate to letcode website")
	public void user_nav_website() throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://letcode.in");
		Thread.sleep(1000);
	    System.out.println("==LetCode homepage loaded==");
	}
	
	@And("user navigate to practice workspace")
	public void user_navigate_to_practice_workspace() throws InterruptedException {
		LC_H = new LetCode_Home(driver);
		LC_H.workspace();
		Thread.sleep(1000);
		System.out.println("==Practice workspace loaded==");
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
	@Then("user click on home button and navigate to same page")
	public void user_click_on_home_button_and_navigate_to_same_page(){
		LC_B = new LetCode_Button(driver);
		LC_B.homepage();
		LC_H = new LetCode_Home(driver);
		LC_H.workspace();
		LC_T = new LetCode_Test(driver);
		LC_T.SwitchCard("button");
				
	}
	@And ("user get coordinates of button")
	public void user_get_coordinates_of_button() {
		LC_B = new LetCode_Button(driver);
		LC_B.getcoordinate();
		
	}
	@And("user find color of the button")
	public void user_find_color_of_the_button() {
		LC_B = new LetCode_Button(driver);
		LC_B.getbtncolor();
		
	}
	@And ("user find dimension of button")
	public void user_find_dimension_of_button() {
		LC_B = new LetCode_Button(driver);
		LC_B.getbtnsize();
		
	}
	@And ("user verifies the button is disabled")
	public void user_verifies_the_button_is_disabled() {
		LC_B = new LetCode_Button(driver);
		LC_B.isbtnenabled();
		
	}
	@And ("user click and hold button")
	public void user_click_and_hold_button() throws InterruptedException {
		LC_B = new LetCode_Button(driver);
		LC_B.clickholdbtn();	
		
	}
	@And("^user select (.*) in dropdown$")
	public void user_select_fruit_in_dropdown(String fruit) throws InterruptedException 
	{
	   LC_DP = new LetCode_Select(driver);
	   LC_DP.select_fruit(fruit);
		
	}
	@And("user select multiple superhero")
	public void user_select_multiple_superhero() {
		LC_DP=new LetCode_Select(driver);
		LC_DP.multislect_superhero();
	}
	
	@And("user select last program language")
	public void user_select_last_program_language() throws InterruptedException {
		LC_DP=new LetCode_Select(driver);
		LC_DP.select_last_option();

	}
	@And ("user select india and print seleted option")
	public void user_select_india_and_print_seleted_option() {
		LC_DP=new LetCode_Select(driver);
		LC_DP.select_india();		
	}
	@And ("user handles simple alert")
	public void user_handles_simple_alert() {
		
		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.simpleAlert();		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	@And ("user handles confirm alert")
	public void user_handles_confirm_alert() {
			
		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.confirmAlert();		
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
	@And ("user handles prompt alert")
	public void user_handles_prompt_alert() {
			
		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.promptAlert();		
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
	@And ("user handles modern alert")
	public void user_handles_modern_alert() {
			
		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.modernAlert();		
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
}
