package pages;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Button {
	
	@FindBy(how = How.XPATH,using="//button[text()='Goto Home']") WebElement home_btn;
	@FindBy(how=How.XPATH,using="//button[@id='position']") WebElement position_btn;
	@FindBy(how=How.XPATH,using="//button[@id='color']") WebElement color_btn;
	@FindBy(how=How.XPATH,using="//button[@id='property']") WebElement size_btn;
	@FindBy(how=How.XPATH, using="//button[text()='Disabled']") WebElement disabled_btn;
	@FindBy(how=How.XPATH, using="//button/div/h2") WebElement clickhold_btn;
		
	WebDriver driver;
	public LetCode_Button(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void homepage() {
		home_btn.click();
	}
	public void getcoordinate() {
		Point coordinate = position_btn.getLocation();
		int x_pos = coordinate.getX();
		int y_pos = coordinate.getY();
		System.out.println("Co-ordiated of button is "+x_pos+" "+y_pos);
		
	}
	public void getbtncolor() {
		System.out.println("Color of the button ==> "+color_btn.getCssValue("background-color"));
		
		
	}
	public void getbtnsize() {
		System.out.println("Size of button ==> "+size_btn.getSize());
	}
	public void isbtnenabled() {
		if(disabled_btn.isEnabled()) {
			System.out.println("Button is enabled");
		}
		else {
			System.out.println("Button is disabled");
		}
	}
	public void clickholdbtn() throws InterruptedException {
		System.out.println("Button's text before performing action ==> "+clickhold_btn.getText());
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.clickAndHold(clickhold_btn).build().perform();
		Thread.sleep(2000);
		action.moveToElement(clickhold_btn).release();
		Thread.sleep(2000);
		System.out.println("Button's text after performing action ==> "+clickhold_btn.getText());
				
		
	}

	
	
	
	
}
