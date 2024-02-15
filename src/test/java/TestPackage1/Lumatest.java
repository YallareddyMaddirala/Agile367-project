package TestPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import PagePackage.Lumapage;

public class Lumatest extends BaseTest
{
	Lumapage p2;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void Lumatest()
	{
		_instance = PropertySingleton.getInstance();
		p2 = new Lumapage(GenericKeywordsWithPage.driver);
	}

	@BeforeClass
	public void startReport()
	{   
		beforeClassForChild(this);

	}
	@Test
	public void loginWithValidCredentials() throws Exception 
	{
		extentLoggerECP = parentExtentLogger.createNode("Done Luma Product");
		s_assert = new SoftAssert();
		p2 = new Lumapage(GenericKeywordsWithPage.driver);
		Thread.sleep(3000);
		p2.movetoElement();
		Thread.sleep(3000);
		p2.tops(); 
		Thread.sleep(3000);
		p2.tees();
		Thread.sleep(3000);
		p2.dresslink();
		Thread.sleep(3000);
		p2.size1("S");
		Thread.sleep(3000);
		p2.colour1("Yellow");
		Thread.sleep(3000);
		p2.addcart();
		Thread.sleep(3000);
		p2.verifycart();

	}
}
