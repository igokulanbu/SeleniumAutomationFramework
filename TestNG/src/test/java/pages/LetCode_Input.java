package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Input {
	@FindBy(how = How.XPATH,using="//input[@id='fullName']") WebElement name_txt;
	@FindBy(how = How.XPATH,using="//input[@id='join']") WebElement append_txt;
	@FindBy(how = How.XPATH,using="//input[@id='getMe']") WebElement in_txt;
	@FindBy(how=How.XPATH,using="//input[@id='clearMe']") WebElement clear_txt;
	@FindBy(how=How.XPATH,using="//input[@id='noEdit']") WebElement disabled_txt;
	@FindBy(how=How.XPATH,using="//input[@id='dontwrite']") WebElement ro_txt;
	
	WebDriver driver;
	public LetCode_Input(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void entername() {
		name_txt.sendKeys("Gokul A");
		
	}
	public void appendMe() {
		append_txt.click();
		append_txt.sendKeys(" person");
		append_txt.sendKeys(Keys.TAB);
	}
	public void getMe() {
		String s = in_txt.getAttribute("Value");
		System.out.println(s);
		
	}
	public void clearMe() {
		clear_txt.clear();
	}
	public void disableMe() {
		if(disabled_txt.isEnabled()) {
			System.out.println("Input field is enabled");
		}else {
			System.out.println("Input field is disabled");
		}
	}
	public void readonly() {
		String s = ro_txt.getAttribute("readonly");
		boolean b=Boolean.parseBoolean(s);  
		if(b) {
			System.out.println("Input field is readonly");
		}else {
			System.out.println("Input field is editable");
		}
	}
		
	}

