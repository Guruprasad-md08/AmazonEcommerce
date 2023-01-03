package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferSupportPage {
	@FindBy(xpath="//a[contains(@class,'hide close-popup')]")
	private WebElement closeX;
	
	public OfferSupportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickoncloseX()
	{
		closeX.click();
	}
}
