package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobilessearchpage {
	@FindBy(xpath="(//div[contains(@class,'aok-relative')])[1]")
	private WebElement phone;
	
	public mobilessearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonphone()
	{
		phone.click();
	}
}
