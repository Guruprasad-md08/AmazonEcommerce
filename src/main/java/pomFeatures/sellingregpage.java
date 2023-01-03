package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sellingregpage {
	@FindBy(id="signInSubmit")
	private WebElement signin;
	
	public sellingregpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifybtn()
	{
		signin.isDisplayed();
	}
}
