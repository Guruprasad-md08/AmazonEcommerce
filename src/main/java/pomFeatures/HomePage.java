package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Sell']")
	private WebElement sell;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="//a[text()=' Electronics ']")
	private WebElement electronics;
	
	
	@FindBy(xpath="//img[contains(@alt,'STRIFF Adjustable Laptop Tabletop')]")
	private WebElement laptop;	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonsell()
	{
		sell.click();
	}

	public void clickonmobiles()
	{
	mobiles.click();
	}	
	public void clickonelectronics()
	{
		electronics.click();
	}
	
	public void clickonlaptop()
	{
		laptop.click();
	}	
	
}
