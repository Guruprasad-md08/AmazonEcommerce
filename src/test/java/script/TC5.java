package script;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import genericLib.WebdriverUtilities;
import pomFeatures.FreshPage;
import pomFeatures.HomePage;

public class TC5 extends StepGroup{
	@Test
	public void testcase5() throws InterruptedException
	{
		WebdriverUtilities  driverutilitiess= new WebdriverUtilities();
		HomePage hpage=new HomePage(driver);
		FreshPage fpage = new FreshPage(driver);
		
		hpage.clickonfresh();
		driverutilitiess.waitForSkip(driver);
		fpage.getSkip();
		
	}
}
