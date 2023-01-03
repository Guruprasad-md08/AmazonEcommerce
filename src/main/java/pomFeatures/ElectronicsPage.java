package pomFeatures;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	@FindBy(xpath="//span[contains(text(),'Fitness trackers & smartwatches')]")
	private WebElement watches;
	
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonwatches()
	{
		watches.click();
		
	}
	
}
