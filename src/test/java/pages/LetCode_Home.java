package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Home {
	
	@FindBy(how = How.XPATH,using="//a[text()='Work-Space']") WebElement workspace_btn;
	
	WebDriver driver;
	public LetCode_Home (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void workspace() {
		workspace_btn.click();
	}

	
}
