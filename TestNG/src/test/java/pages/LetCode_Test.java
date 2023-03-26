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
		}
		
	}
	
}
