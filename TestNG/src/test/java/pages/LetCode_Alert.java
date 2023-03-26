package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.lang3.RandomStringUtils;

public class LetCode_Alert {
	
	@FindBy(how = How.XPATH,using="//button[@id='accept']") WebElement simpleAlert_btn;
	@FindBy(how = How.XPATH,using="//button[@id='confirm']") WebElement confirmAlert_btn;
	@FindBy(how = How.XPATH,using="//button[@id='prompt']") WebElement promptAlert_btn;
	@FindBy(how = How.XPATH,using="//button[@id='modern']") WebElement modernAlert_btn;
	@FindBy(how = How.XPATH,using="//p[@id='myName']") WebElement promptAlert_text;
	@FindBy(how = How.XPATH,using="//button[@class='modal-close is-large']") WebElement modernAlert_close;
	
	////button[@class='modal-close is-large']
	
	WebDriver driver;
	public LetCode_Alert (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void simpleAlert() {
		System.out.println("\n"+"=====> Simple Alert <===="+"\n");
		simpleAlert_btn.click();
		System.out.println("User clicked simple alert button");
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message ==> "+alertMessage);
		alert.accept();
		System.out.println("==> Successfully handled simple alert <==");
		
	}
	public void confirmAlert() {
		System.out.println("\n"+"=====> Confirm Alert <===="+"\n");
		confirmAlert_btn.click();
		System.out.println("User clicked confirm alert button");
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message ==> "+alertMessage);
		alert.accept();
		System.out.println("==> Successfully handled confirm alert on clicking OK <==");
		confirmAlert_btn.click();
		System.out.println("User clicked confirm alert button again");
		alert.dismiss();
		System.out.println("==> Successfully handled confirm alert on clicking cancel <==");
		
	}
	
	public void promptAlert() {
		System.out.println("\n"+"=====> Prompt Alert <===="+"\n");
		promptAlert_btn.click();
		System.out.println("User clicked confirm prompt button");
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert message ==> "+alertMessage);
		alert.sendKeys(RandomStringUtils.randomAlphabetic(4));
		alert.accept();
		System.out.println("==> Successfully handled prompt alert on entering name and clicking OK <==");
		System.out.println(promptAlert_text.getText());
		confirmAlert_btn.click();
		System.out.println("User clicked confirm alert button again");
		alert.dismiss();
		System.out.println("==> Successfully handled prompt alert on clicking cancel <==");
		
	}
	
	public void modernAlert() {
		System.out.println("\n"+"=====> Modern Alert <===="+"\n");
		modernAlert_btn.click();
		System.out.println("User clicked simple modern button");
		modernAlert_close.click();
		System.out.println("==> Successfully handled modern alert <==");

	}

}
	
