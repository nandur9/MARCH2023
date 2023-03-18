

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebElementTesting {
	  WebDriver driver1;
	  String appurl ="http://courses.letskodeit.com/practice";
@Test (priority=1)
public void VerifyRadioButton() throws InterruptedException {
	  WebElement Radiobmw = driver1.findElement(By.id("bmwradio"));
	  Radiobmw.click();
	  Thread.sleep(2000);
      }
@Test (priority=2)
public void VerifyCheckbox() throws InterruptedException {
	  WebElement checkboxbmw = driver1.findElement(By.id("bmwcheck"));
	  checkboxbmw.click();
	  Thread.sleep(2000);
  }
@BeforeTest	
public void LaunchBrowser() {
	   System.out.println("Launchbrowser");
	   System.setProperty("webdriver.edge.driver","C:\\Program Files\\SeleniumDrivers\\edgeDrivers\\edgeDrivers.exe");
	  driver1 = (WebDriver) new EdgeDriver();
	  driver1.manage().window().maximize();
	  driver1.get(appurl);
    }
@AfterTest
public void CloseBrowser() {
	   System.out.println("closebrowser");
	  driver1.close();
     }
@BeforeMethod()
public void VerifyTitle()
   {
	 System.out.println("Runs before each test in a class is Executed");
	driver1.get(appurl);
	 System.out.println(driver1.getTitle());  
    }
@AfterMethod()
public void VerifyHomepage() {
	 System.out.print("Runs after each test is executed");
	WebElement Homelink = driver1.findElement(By.linkText ("HOME"));
	Homelink.click();
	 System.out.println(driver1.getTitle());  
	}
}
