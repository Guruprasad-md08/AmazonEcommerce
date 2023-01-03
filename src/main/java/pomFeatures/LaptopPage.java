package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage {

@FindBy(xpath="//h2[contains(text(),' What is in the box? ')]")
private WebElement laptext;

public LaptopPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void verifythetext()
{
	laptext.isDisplayed();
	
}
}
