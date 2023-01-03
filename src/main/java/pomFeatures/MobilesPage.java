package pomFeatures;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	public MobilesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entersearchbox(String text)
	{
		searchbox.sendKeys(text);
		searchbox.sendKeys(Keys.ENTER);
	}
}

