package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LetCode_Elements {
	
	@FindBy(how = How.XPATH,using="//input[@name='username']") WebElement username;
	@FindBy(how = How.XPATH,using="//button[@type='submit']") WebElement submit_btn;
	@FindBy(how = How.XPATH,using="//img[@alt='Placeholder image']") WebElement profile;
	@FindBy(how = How.XPATH,using="//p[@class='title is-4']") WebElement profile_name;
	@FindBy(how = How.XPATH,using="//p[@class='subtitle is-6']") WebElement profile_loc;
	@FindBy(how = How.XPATH,using="//p[@class='title is-4']/following-sibling::span") WebElement profile_des;
	@FindBy(how = How.XPATH,using="//span[text()='Public Repos']/following-sibling::span") WebElement profile_pubRepo;
	@FindBy(how = How.XPATH,using="//app-gitrepos/div/div/ol/li") WebElement profile_link;
	
	
	
	
	
	
	WebDriver driver;
	public LetCode_Elements (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void elements_Actions(String uname) throws Exception
	{
		int cnt;
		username.sendKeys(uname);
		submit_btn.click();
		System.out.println("===> User performed search <===");
		Thread.sleep(3000);
		Assert.assertEquals(profile.isDisplayed(),true);
		System.out.println(profile_name.getText());
		System.out.println(profile_loc.getText());
		System.out.println(profile_des.getText());
		SoftAssert soft = new SoftAssert();
		switch(uname) {
		case "sad":
			cnt = Integer.parseInt(profile_pubRepo.getText());
			soft.assertEquals(cnt, 6);
			break;
		case "d":
			cnt = Integer.parseInt(profile_pubRepo.getText());
			soft.assertEquals(cnt, 112);
			break;
			
		}
		List<WebElement> list_git = driver.findElements(By.xpath("//app-gitrepos/div/div/ol/li"));
		for (WebElement it:list_git)
		{
			System.out.println(it);
		}
		
		
		
		
	}
		

}
	
