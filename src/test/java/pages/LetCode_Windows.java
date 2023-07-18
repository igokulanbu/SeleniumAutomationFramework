package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;

public class LetCode_Windows {
	
	@FindBy(how = How.XPATH,using="//button[text()='Open Home Page']") WebElement GoToHome_btn;
	@FindBy(how = How.XPATH,using="//button[@id='multi']") WebElement OpenMultipleWindows_btn;
	
	
	WebDriver driver;
	public LetCode_Windows (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void goToHome_Actions()
	{
		System.out.println("Current Page: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Window: "+driver.getWindowHandle());
		System.out.println("---------------------------------------");
		GoToHome_btn.click();
		System.out.println("==> User successfully performed click <==");
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("---------------------------------------");
		Set<String> windowSet = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowSet);
		System.out.println("Windows List: "+windowList);
		driver.switchTo().window(windowList.get(1));
		System.out.println("==> User successfully navigated to new window <==");
		System.out.println("Current Page: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Window: "+driver.getWindowHandle());
		System.out.println("---------------------------------------");
		driver.switchTo().window(windowList.get(0));
		System.out.println("==> User successfully navigated to initial window <==");
		System.out.println("Current Page: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Window: "+driver.getWindowHandle());
		System.out.println("---------------------------------------");
		driver.close();
		System.out.println("==> User succefully closed the initial window <==");
		windowSet.clear();
		windowSet = driver.getWindowHandles();
		windowList.clear();
		windowList = new ArrayList<String>(windowSet);
		System.out.println("Windows List: "+windowList);
		System.out.println("---------------------------------------");
		driver.switchTo().window(windowList.get(0));
		System.out.println("==> User successfully navigated to window <==");
		System.out.println("Current Page: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Window: "+driver.getWindowHandle());
		driver.close();
		
	}
	
	public void openMultipleWindows_Actions()
	{
		System.out.println("Current Page: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Current Window: "+driver.getWindowHandle());
		System.out.println("---------------------------------------");
		OpenMultipleWindows_btn.click();
		System.out.println("==> User successfully performed click <==");
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("---------------------------------------");
		Set<String> windowSet = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowSet);
		System.out.println("Windows List: "+windowList);
		
	}

}
	
