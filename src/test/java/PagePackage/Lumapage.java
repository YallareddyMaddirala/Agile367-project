package PagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.surveillance.utilitiy.GenericKeywordsWithPage;


public class Lumapage {


	public  Lumapage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(xpath="(//a[@class='level-top ui-corner-all'])[2]")
	WebElement Women;
	@FindBy(xpath="(//a[@class='ui-corner-all'])[1]")
	WebElement tops;
	@FindBy(xpath="(//span[text()='Tees'])[1]")
	WebElement tees;
	@FindBy(xpath="(//a[@class='product-item-link'])[1]")
	WebElement dresslink;
	@FindBy(xpath="//span[text()='Size']/following::div[1]/div")
	WebElement s;
	@FindBy(xpath="//div[text()='M']")
	WebElement si;
	@FindBy(xpath="//div[text()='L']")
	WebElement si1;
	@FindBy(xpath="//div[text()='XL']")
	WebElement si2;
	@FindBy(xpath="//div[text()='XS']")
	WebElement si3;
	@FindBy(xpath="//div[text()='S']")
	WebElement si4;
	@FindBy(xpath="(//div[@class='swatch-option color'])[1]")
	WebElement colour;
	@FindBy(xpath="(//div[@class='swatch-option color'])[2]")
	WebElement colour1;
	@FindBy(xpath="(//div[@class='swatch-option color'])[3]")
	WebElement colour2;
	@FindBy(xpath="//button[@class='action primary tocart']")
	WebElement addcart;
	@FindBy(xpath="//a[@class='action showcart']")
	WebElement verifycart;
	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement text1;

	GenericKeywordsWithPage page = new 	GenericKeywordsWithPage("Luma");
	public void movetoElement() throws Exception
	{
		page.movetoElement(Women);
	}
	public void tops() throws Exception
	{
		page.click(tops);
	}
	public void tees() throws Exception 
	{
		Thread.sleep(3000);
		page.movetoElement(tees);
		page.click(tees);
	}
	public void dresslink() 
	{
		page.click(dresslink);
	}
	public void size1(String s3) 
	{
		if(s3.equals("M"))
		{	
		page.click(si);
		}
		else if(s3.equals("L"))
		{
			page.click(si1);
		}
		else if(s3.equals("XL"))
		{
			page.click(si2);
		}
		else if(s3.equals("XS"))
		{
			page.click(si3);
		}
		else if(s3.equals("S"))
		{
			page.click(si4);
		}
	}
	
	public void colour1(String co) 
	{
		if(co.equals("Black"))
		{
			page.click(colour);
		}
		else if(co.equals("Orange"))
		{
			page.click(colour1);
		}
		else if(co.equals("Yellow"))
		{
		page.click(colour2);
		}
	}
	public void addcart() 
	{
		page.click(addcart);
	}
	public void verifycart() 
	{

		String actualText=text1.getText();
		System.out.println(actualText);
		String expectedresult="You added Desiree Fitness Tee to your shopping cart.";
		Assert.assertEquals(actualText , expectedresult,"Text not verified");
		System.out.println("Done");

	}		
}


