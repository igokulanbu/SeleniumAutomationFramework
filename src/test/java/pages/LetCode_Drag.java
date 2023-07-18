package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Drag {
	
	@FindBy(how = How.XPATH,using="//div[@class='cdk-drag example-box']") WebElement dragbox;
	@FindBy(how = How.XPATH,using="//div[@id='draggable']") WebElement dragbox2;
	
	
	WebDriver driver;
	public LetCode_Drag (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void dragbox()
	{
		try {
			Thread.sleep(5000);
			int x = dragbox.getLocation().getX();
			int y = dragbox.getLocation().getY();
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(dragbox, x+50, y+50).perform();
			driver.get("https://jqueryui.com/draggable/");
			driver.switchTo().frame(0);
			Thread.sleep(5000);
			builder.dragAndDropBy(dragbox2, 40, 40).perform();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
	
