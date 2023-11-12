package stepDefinitions;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LetCode_Alert;
import pages.LetCode_Button;
import pages.LetCode_Drag;
import pages.LetCode_Elements;
import pages.LetCode_Frame;
import pages.LetCode_Select;
import pages.LetCode_Home;
import pages.LetCode_Input;
import pages.LetCode_Ratio;
import pages.LetCode_Test;
import pages.LetCode_Windows;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_SD {
	private static final Logger logger = LoggerFactory.getLogger(Learning_SD.class);
	 static ExtentReports extent;
	 static ExtentSparkReporter spark;
	 static ExtentTest test;

	WebDriver driver;
	LetCode_Test LC_T;
	LetCode_Input LC_I;
	LetCode_Home LC_H;
	LetCode_Button LC_B;
	LetCode_Select LC_DP;
	LetCode_Alert LC_AL;
	LetCode_Frame LC_F;
	LetCode_Ratio LC_R;
	LetCode_Windows LC_Win;
	LetCode_Elements LC_Ele;
	@BeforeAll
	public static void suite_setup(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		String formattedTimestamp = formatter.format(LocalDateTime.now());
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(String.format("reports/%s_Spark.html",formattedTimestamp));
	}
	@AfterAll
	public static void suite_tearDown(){
		extent.flush();
	}
	@Before
	public static void setup(Scenario scenario){
		test = extent.createTest(scenario.getName());
	}
	@Given("user launch browser")
	public void LaunchBrowser()
	{
		try{
			extent.attachReporter(spark);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			logger.atInfo().log("Launched browser successfully!");
			test.log(Status.PASS, "Launched browser successfully!");
		}
		catch (Exception e){
			logger.atError().log("Fails to launch browser!");
			test.log(Status.FAIL, e.getMessage());
		}

	}

	@Then("user navigate to letcode website")
	public void user_nav_website() throws InterruptedException 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://letcode.in");
		logger.atInfo().log("Successfully launched LetCode page!");
		test.log(Status.PASS, "Successfully launched LetCode page!");

	}

	@And("user navigate to practice workspace")
	public void user_navigate_to_practice_workspace() throws InterruptedException {
		LC_H = new LetCode_Home(driver);
		LC_H.workspace();
		logger.atInfo().log("Navigated to practice  workspace successfully!");
		test.log(Status.PASS, "Navigated to practice  workspace successfully!");
	}


	@When("user click on {string} card")
	public void user_nav_website(String card) throws InterruptedException 
	{
		// Write code here that turns the phrase above into concrete actions
		LC_T = new LetCode_Test(driver);
		LC_T.SwitchCard(card);
		System.out.println("=="+card+" card loaded==");		
	}

	@Then("user enters data in Enter your full Name filed")
	public void user_enters_data_in_Enter_your_full_Name_filed() throws InterruptedException{

		LC_I = new LetCode_Input(driver);
		LC_I.entername();
	}
	@And("user Append a text and press keyboard tab")
	public void  user_Append_text_press_keyboard_tab() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.appendMe();

	}
	@And("user reads the text in the field")
	public void  user_reads_the_text_in_the_field() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.getMe();
	}
	@And("user clears text in the field")
	public void  user_clears_text_in_the_field() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.clearMe();
	}
	@And("user verify the input field is disabled")
	public void  user_verify_the_input_field_is_disabled() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.disableMe();
	}
	@And("user verify the input filed is read only")
	public void  user_verify_the_input_filed_is_read_only() throws InterruptedException {
		LC_I = new LetCode_Input(driver);
		LC_I.readonly();
	}

	@And ("user exit browser")
	public void ExitBrowser() throws InterruptedException{
		driver.quit();
		logger.atInfo().log("Terminated Browser!");

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
	@And("user select {string} in dropdown")
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
		try {
			LC_DP=new LetCode_Select(driver);
			LC_DP.select_last_option();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	@And ("user select india and print seleted option")
	public void user_select_india_and_print_seleted_option() {
		try {
			LC_DP=new LetCode_Select(driver);
			LC_DP.select_india();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user handles simple alert")
	public void user_handles_simple_alert() {

		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.simpleAlert();		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user handles confirm alert")
	public void user_handles_confirm_alert() {

		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.confirmAlert();		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user handles prompt alert")
	public void user_handles_prompt_alert() {

		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.promptAlert();		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user handles modern alert")
	public void user_handles_modern_alert() {

		try {
			LC_AL=new LetCode_Alert(driver);
			LC_AL.modernAlert();		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user enters name details")
	public void user_enters_name_details() {

		try {
				LC_F = new LetCode_Frame(driver);
				LC_F.enterNameDetails();
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user enters email")
	public void user_enters_email() {

		try {
				LC_F = new LetCode_Frame(driver);
				LC_F.enterEmailDetails();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@And ("user click watch titorial link")
	public void user_click_watch_titorial_link() {

		try {
				LC_F = new LetCode_Frame(driver);
				LC_F.watchTutorial();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@And ("user select any one ratio button")
	public void user_select_any_one_ratio_button() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.select_yes();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user confirms selected only one ratio button")
	public void user_confirms_selected_only_one_ratio_button() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.selectOnlyOneButton("confirm");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user verifies both ratio button is not selected")
	public void user_verifies_both_ratio_button_is_not_selected() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.selectOnlyOneButton("find");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user verified the selected ratio button")
	public void user_verified_the_selected_ratio_button() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.verify_selected_ratiobtn();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user verifies last ratio button in disabled")
	public void user_verifies_last_ratio_button_in_disabled() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.isRatioDisabled();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user verifies checkbox is selected")
	public void user_verifies_checkbox_is_selected() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.isCheckboxSelected();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@And ("user accepts the terms and conditions")
	public void user_accepts_the_terms_and_conditions() 
	{
		try
		{
			LC_R = new LetCode_Ratio(driver);
			LC_R.checkTC();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@And ("user handles windows on clicking GoToHome button")
	public void  user_handles_windows_on_clicking_GoToHome_button()
	{
		try {
			LC_Win = new LetCode_Windows(driver);
			LC_Win.goToHome_Actions();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@And ("user handles windows on clicking OpenMultipleWindows button")
	public void  user_handles_windows_on_clicking_OpenMultipleWindows_button()
	{
		try {
			LC_Win = new LetCode_Windows(driver);
			LC_Win.openMultipleWindows_Actions();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@And ("user perform actions for {string} in element page")
	public void  user_perform_actions_in_element_page(String uname)
	{

		try {
			LC_Ele = new LetCode_Elements(driver);
			LC_Ele.elements_Actions(uname);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@And ("user perform drag action")
	public void user_perform_drag_action()
	{
		try {
			LetCode_Drag LC_Drag = new LetCode_Drag(driver);
			LC_Drag.dragbox();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
