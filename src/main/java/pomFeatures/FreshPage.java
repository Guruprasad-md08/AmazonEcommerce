package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericLib.WebdriverUtilities;

public class FreshPage {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Skip']")
	private WebElement skip;
	
	public FreshPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*public void clickOnskip()
	{
		WebdriverUtilities utility = new WebdriverUtilities();
		utility.wait(skip);
		skip.click();
	}
*/
	public WebElement getSkip() {
		return skip;
	}

	
}
