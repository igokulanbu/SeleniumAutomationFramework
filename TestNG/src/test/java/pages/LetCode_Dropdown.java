package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LetCode_Dropdown {
	
	@FindBy(how=How.XPATH, using="//select[@id='fruits']") WebElement fruit_dropdown;
	@FindBy(how=How.XPATH, using="//select[@id='superheros']") WebElement superhero_dropdown;
	@FindBy(how=How.XPATH, using="//select[@id='lang']") WebElement program_dropdown;
	@FindBy(how=How.XPATH, using="//select[@id='country']") WebElement country_dropdown;
	
	
	WebDriver driver;
	public LetCode_Dropdown(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void select_fruit(String fruit) {
		
		Select select_fruit_dp = new Select(fruit_dropdown);
		select_fruit_dp.selectByVisibleText("Apple");
		System.out.println("User selected "+fruit+ " fruit.");
		
	}
	public void multislect_superhero() {
		Select select_superhero = new Select(superhero_dropdown);
		if (select_superhero.isMultiple()) {
			select_superhero.selectByVisibleText("Ant-Man");
			select_superhero.selectByVisibleText("The Avengers");
			select_superhero.selectByVisibleText("Batman");
			select_superhero.selectByVisibleText("Black Panther");
			List<WebElement> list_allsuperhero = select_superhero.getOptions();
			System.out.println("===> All options <===");
			for(WebElement fruit:list_allsuperhero)  
				  System.out.println(fruit.getText());
			System.out.println("-----------------------------");
			System.out.println("===> User selected option <===");
			List<WebElement> list_superhero = select_superhero.getAllSelectedOptions();
			for(WebElement fruit:list_superhero)  
				  System.out.println(fruit.getText());	
			System.out.println("-----------------------------");
			System.out.println("User deselect Batman");
			select_superhero.deselectByVisibleText("Batman");
			System.out.println("===> User selected option <===");
			list_superhero = select_superhero.getAllSelectedOptions();
			for(WebElement fruit:list_superhero)  
				  System.out.println(fruit.getText());	
			System.out.println("-----------------------------");
			
		}
		else {
			System.out.println("Dropdown doesn't support multi-select option");
		}
	}
	public void select_last_option() {
		Select select_program_dp = new Select(program_dropdown);
		List<WebElement> list_allprogram = select_program_dp.getOptions();
		int program_dp = list_allprogram.size();
		select_program_dp.selectByIndex(program_dp-1);
		System.out.println("User selected last option in program dropdown");
		System.out.println("===> Program dropdown list <===");
		for(WebElement program_values:list_allprogram)
			System.out.println(program_values.getText());
		System.out.println("-----------------------------");
	}
	public void select_india() {
		Select select_country_dp = new Select(country_dropdown);
		select_country_dp.selectByVisibleText("India");
		System.out.println("Selected value ==> "+select_country_dp.getFirstSelectedOption().getText());
	}
	

}
