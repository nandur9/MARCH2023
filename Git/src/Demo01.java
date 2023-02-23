
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 // Launch Website
		 driver.get("http:www.selenium.com/");
		 /*//click on the search text box and send volue);
		 //driver.findElement(By.name("q")).sendKeys("Selenium");
		 
		 //click on the search button
		// driver.findElement(By.name("btnK")).click();
		 
		 //Thread.sleep(1000);
		  * */
		 
		 System.out.println("Tile of page "+ driver.getTitle());
		 
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "selenium";
		 if (actualTitle.equals(expectedTitle))
		 {
			 System.out.println("verification successful correct url is opened");
		 }
		 else
		 {
			 System.out.println("verification failed incorret url"); 
		 }
	
	      //catch(final Exception ex);
	      
	     {
		     System.out.println("error"+ expectedTitle);
	     }
	     // finally
	     {
	       //driver.close();
	     }
	}

}
