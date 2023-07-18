package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LetCode_Test {

	@FindBy(how = How.XPATH,using="//a[contains(text(),'Edit')]") WebElement input_btn;
	@FindBy(how = How.XPATH,using="//a[contains(text(),'Click')]") WebElement button_btn;
	@FindBy(how = How.XPATH,using="//a[text()='Drop-Down']") WebElement select_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/alert']") WebElement alert_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/frame']") WebElement frame_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/radio']") WebElement radio_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/windows']") WebElement window_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/elements']") WebElement elements_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/draggable']") WebElement drag_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/dropable']") WebElement drop_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/sortable']") WebElement sort_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/selectable']") WebElement multiselect_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/slider']") WebElement slider_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/table']") WebElement table_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/advancedtable']") WebElement table2_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/calendar']") WebElement calendar_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/waits']") WebElement waits_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/forms']") WebElement forms_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/file']") WebElement file_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/shadow']") WebElement shadow_btn;
	@FindBy(how = How.XPATH,using="//a[@href='/game']") WebElement game_btn;
	
	
	
	
	
	
	WebDriver driver;
	public LetCode_Test(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void SwitchCard(String name) {
		switch(name){
		case "input":
			input_btn.click();
			System.out.println("User clicked input card");
			break;
		case "button":
			button_btn.click();
			System.out.println("User clicked button card");
			break;
		case "dropdown":
			select_btn.click();
			System.out.println("User clicked button card");
			break;
		case "alert":
			alert_btn.click();
			System.out.println("User clicked button card");
			break;
		case "frame":
			frame_btn.click();
			System.out.println("User clicked button card");
			break;
		case "radio":
			radio_btn.click();
			System.out.println("User clicked button card");
			break;
		case "windows":
			window_btn.click();
			System.out.println("User clicked button card");
			break;
		case "elements":
			elements_btn.click();
			System.out.println("User clicked button card");
			break;
		case "drag":
			drag_btn.click();
			System.out.println("User clicked button card");
			break;
		case "drop":
			drop_btn.click();
			System.out.println("User clicked button card");
			break;
		case "sort":
			sort_btn.click();
			System.out.println("User clicked button card");
			break;
		case "multiselect":
			frame_btn.click();
			System.out.println("User clicked button card");
			break;
		case "slider":
			slider_btn.click();
			System.out.println("User clicked button card");
			break;
		case "table":
			table_btn.click();
			System.out.println("User clicked button card");
			break;
		case "tableadvanced":
			table2_btn.click();
			System.out.println("User clicked button card");
			break;
		case "calendar":
			calendar_btn.click();
			System.out.println("User clicked button card");
			break;
		case "waits":
			waits_btn.click();
			System.out.println("User clicked button card");
			break;
		case "forms":
			forms_btn.click();
			System.out.println("User clicked button card");
			break;
		case "file":
			file_btn.click();
			System.out.println("User clicked button card");
			break;
		case "shadow":
			shadow_btn.click();
			System.out.println("User clicked button card");
			break;
		case "game":
			game_btn.click();
			System.out.println("User clicked button card");
			break;
		}
		
	}
	
}
