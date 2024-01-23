package new_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;


public class pom_new_test {
	public static WebDriver driver;
	@FindBy(xpath="//*[@name=\"email\"]")  
	WebElement Email;
	
	@FindBy(xpath="//*[@type='password']")  
	WebElement Pas;
	
	@FindBy(xpath="//*[contains(text(),'Connect with')]")  
	WebElement Fb_Text;
	
	public pom_new_test(WebDriver driver) {
		pom_new_test .driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void Email(String Emaill) throws InterruptedException  {
//	System.out.println("1st test");
	Email.sendKeys(Emaill);
	Thread.sleep(1000);}
			
	 public void Pas(String pass) throws InterruptedException  {
	 Pas.sendKeys(pass);
//	 System.out.println("2nd test");
	 Thread.sleep(1000);}
	 
	 //HARD Assert
	public void FB_Hard_Assert() throws InterruptedException  {
	String Actual_text=Fb_Text.getText();
    String Expected_text= "Connect with friends and the world around you on Facebook.";
	AssertJUnit.assertEquals(Actual_text, Expected_text);
	Thread.sleep(1000);}
	 
	//Soft assert 
	public void FB_Soft_Assert() throws InterruptedException  {
	String Actual_text=Fb_Text.getText();
	String Expected_text= "Connect with friends and the world around you on Facebook.";
	SoftAssert OK = new SoftAssert();
    AssertJUnit.assertEquals(Actual_text, Expected_text);
//  OK.assertAll();                                           // Mandatory line , to stooping executing IF THERE IS ANY MESTAKE
    System.out.println("this line after soft assert method");
    Thread.sleep(1000);}


}
