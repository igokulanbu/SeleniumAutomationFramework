package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LetCode_Ratio {

	@FindBy(how = How.XPATH,using="//label[text()='Select any one']/following-sibling::div/label/input[@id='yes']") WebElement selectAnyOne_yes;
	@FindBy(how = How.XPATH,using="//label[text()='Select any one']/following-sibling::div/label/input[@id='no']") WebElement selectAnyOne_no;
	@FindBy(how = How.XPATH,using="//label[text()='Cofirm you can select only one radio button']/following-sibling::div/label/input[@id='one']") WebElement confirm_yes;
	@FindBy(how = How.XPATH,using="//label[text()='Cofirm you can select only one radio button']/following-sibling::div/label/input[@id='two']") WebElement confirm_no;
	@FindBy(how = How.XPATH,using="//label[text()='Find the bug']/following-sibling::div/label/input[@id='nobug']") WebElement find_yes;
	@FindBy(how = How.XPATH,using="//label[text()='Find the bug']/following-sibling::div/label/input[@id='bug']") WebElement find_no;
	@FindBy(how = How.XPATH, using = "//input[@id='foo']") WebElement find_foo;
	@FindBy(how = How.XPATH, using = "//input[@id='notfoo']") WebElement find_bar;
	@FindBy(how = How.XPATH,using="//input[@id='maybe']") WebElement maybe;
	@FindBy(how = How.XPATH, using="//label[text()='Find if the checkbox is selected?']/following-sibling::label/input") WebElement rememberme;
	@FindBy(how = How.XPATH,using="//label[text()='Accept the T&C']/following-sibling::label/input") WebElement tc_checkbox;


	WebDriver driver;
	public LetCode_Ratio(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void select_yes()
	{
	selectAnyOne_yes.click();
	if (selectAnyOne_yes.isSelected())
	{
		System.out.println("User selected *yes* ratio button");
	}
	else
	{
		System.out.println("Failed to select *yes* ratio button");
	}
	System.out.println("-------------------------------");
	}
	
	public void selectOnlyOneButton(String sbutton )
	{
		WebElement yes = null;
		WebElement no = null;
		switch(sbutton.toLowerCase())
		{
		case "confirm":
			yes = confirm_yes;
			no = confirm_no;
			break;
			
		case "find":
			yes = find_yes;
			no = find_no;
			break;
		}
		
		yes.click();
		if (yes.isSelected())
		{
			System.out.println("User selected *YES* ratio button");
		}
		else
		{
			System.out.println("Failed to select *YES* ratio button");
		}
		
		no.click();
		if (no.isSelected())
		{
			System.out.println("User selected *NO* ratio button");
		}
		else
		{
			System.out.println("Failed to select *NO* ratio button");
		}
		
		if(yes.isSelected() && no.isSelected())
		{
			System.out.println("WARNING: *Both ratio button is selected*");
		}
		else if(yes.isSelected() || no.isSelected())
		{
			System.out.println("==Confirmed only one ratio button is selecteed==");
		}
		
		System.out.println("-------------------------------");
		
	}
	
	public void verify_selected_ratiobtn()
	{
		if(find_foo.isSelected())
		{
			System.out.println("==> Foo is selected <==");
		}
		else if (find_bar.isSelected())
		{
			System.out.println("==> Bar is selected <==");
		}
		System.out.println("-------------------------------");
	}
	public void isRatioDisabled()
	{
		if(maybe.isEnabled())
		{
			System.out.println("==> Maybe ratio button is enabled <==");
		}
		else
		{
			System.out.println("==> Maybe ratio button is disabled <==");
		}
		System.out.println("-------------------------------");
	}
	
	public void isCheckboxSelected()
	{
		if(rememberme.isSelected())
		{
			System.out.println("==> Remember Me chceckbox is checked <==");
		}
		else
		{
			System.out.println("==> Remember Me chceckbox is unchecked <==");
		}
		System.out.println("-------------------------------");
	}
	
	public void checkTC()
	{
		tc_checkbox.click();
		if(tc_checkbox.isSelected())
		{
			System.out.println("==> TC checkbox is checked <==");
		}
		else
		{
			System.out.println("==> TC checkbox is unchecked <==");
		}
		
	}
	
}
