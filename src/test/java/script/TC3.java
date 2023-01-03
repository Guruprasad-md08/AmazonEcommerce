package script;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.ElectronicsPage;
import pomFeatures.HomePage;

public class TC3 extends StepGroup{
	
	@Test
	public void TestCase3()
	{
		HomePage hpage = new HomePage(driver);
		ElectronicsPage epage = new ElectronicsPage(driver);
		hpage.clickonelectronics();
		epage.clickonwatches();
	}
	
}
