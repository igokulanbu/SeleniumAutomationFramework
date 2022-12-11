package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LetCode_Test {

	@FindBy(how = How.XPATH,using="//a[contains(text(),'Edit')]") WebElement input_btn;
//	@FindBy(how = How.XPATH,using="//input[@name='password']") WebElement txt_password;
//	@FindBy(how = How.XPATH,using="//input[@class='button']") WebElement btn_login;
	
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
			
			
		}
		
	}
	
}
