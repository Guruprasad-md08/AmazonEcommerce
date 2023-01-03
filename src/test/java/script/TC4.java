package script;



import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.HomePage;
import pomFeatures.LaptopPage;

public class TC4 extends StepGroup{
	@Test
	public void TestCase4()
	{
		HomePage hpage = new HomePage(driver);
	LaptopPage lpage = new LaptopPage(driver);
	hpage.clickonlaptop();
	lpage.verifythetext();
	}
}
