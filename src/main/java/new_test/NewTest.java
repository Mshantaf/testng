package new_test;

import org.testng.annotations.Test;

//import FB_TestNG_With_Argument.POM_FB_TestNG_With_Argument;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

    public class NewTest {
	public static WebDriver driver;
	
	 @BeforeMethod
     @Parameters({"brow"})   // Step 2 
	 public void beforeMethod(String brow ) {
	 String browser= brow;                    //Step 4
	 if(browser.contains("chrome")) 
		  {  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\chromedriver.exe"); 
	 driver = new ChromeDriver();    // Opening chrome broser
			  }
	 else if (browser.contains("Firefox"))
	 {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\geckodriver.exe"); 
	 driver = new FirefoxDriver();
			  }
	  else
	  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\msedgedriver.exe");   
	  driver = new EdgeDriver();
		  }

	  driver.get("https://www.facebook.com/");  // Navigate to Website
	  driver.manage().window().maximize();
	  }	
	
      @Test(priority=1)
      @Parameters({"Email_Add1","PASS1"})
//    @Parameters({"PASS"})
      public void f(String Email_Add1,String PASS1) throws InterruptedException, IOException {
      pom_new_test ob=new pom_new_test(driver);
      ob.Email(Email_Add1);
      ob.Pas(PASS1);
//    shots_withdate();

    	  
      }
      
      @Test(priority=2)
      @Parameters({"Email_Add2","PASS2"})
      public void f2(String Email_Add2,String PASS2  ) throws InterruptedException {
      pom_new_test ob=new pom_new_test(driver);
      ob.Email(Email_Add2);
      ob.Pas(PASS2);
    	  
      }
 
	  
  

  @AfterMethod
  public void afterMethod() {
		 driver.close();

  }

}
