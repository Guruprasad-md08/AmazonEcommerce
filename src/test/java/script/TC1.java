package script;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.HomePage;
import pomFeatures.SellPage;
import pomFeatures.sellingregpage;

public class TC1 extends StepGroup{
	@Test
	public void testcase1()
	{
		HomePage hpage=new HomePage(driver);
		SellPage spage = new SellPage(driver);
		sellingregpage srpage = new sellingregpage(driver);

		hpage.clickonsell();
		spage.clickonstartselling();
		srpage.verifybtn();
	}
}
