package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage {
	@FindBy(xpath="(//a[text()='Start Selling'])[1]")
	private WebElement startselling;
	
	public SellPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonstartselling()
	{
		startselling.click();
	}
}
