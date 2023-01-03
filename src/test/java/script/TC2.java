package script;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.AutoConstant;
import genericLib.StepGroup;
import pomFeatures.HomePage;
import pomFeatures.MobilesPage;
import pomFeatures.mobilessearchpage;

public class TC2 extends StepGroup{
	
	@Test
	public void TestCase2() throws IOException
	{
		HomePage hpage = new HomePage(driver);
		MobilesPage mpage = new MobilesPage(driver);
		mobilessearchpage mspage = new mobilessearchpage(driver);
		
		hpage.clickonmobiles();
		mpage.entersearchbox(pdata.getPropertyData("searchtext"));
		mspage.clickonphone();
	
	}
	
}
