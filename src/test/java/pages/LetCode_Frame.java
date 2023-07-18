package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Frame {

	@FindBy(how = How.XPATH,using="//input[@name='fname']") WebElement fname_input;
	@FindBy(how = How.XPATH,using="//input[@name='lname']") WebElement lname_input;
	@FindBy(how = How.XPATH,using="//input[@name='email']") WebElement email_input;
	@FindBy(how = How.XPATH,using="//iframe[@id='firstFr']") WebElement enterdetails_frame;
	@FindBy(how = How.XPATH,using="//iframe[@src='innerFrame']") WebElement email_frame;
	@FindBy(how = How.XPATH,using="//a[text()='Watch tutorial']") WebElement watchTutorial_btn;


	WebDriver driver;
	public LetCode_Frame(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void enterNameDetails() {
		driver.switchTo().frame(enterdetails_frame);
		fname_input.sendKeys("Gokul");
		lname_input.sendKeys("Anbu");
		driver.switchTo().defaultContent();
	}
	public void enterEmailDetails() {
		driver.switchTo().frame(enterdetails_frame);
		driver.switchTo().frame(email_frame);
		email_input.sendKeys("anc@gmail.com");
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	}

	public void watchTutorial() {
		watchTutorial_btn.click();
		System.out.println(driver.getTitle());
	}
}
