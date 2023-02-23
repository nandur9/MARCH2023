
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 // Launch Website
		 driver.get("http:www.selenium.com/");
		 
 System.out.println("Tileofpage "+driver.getTitle());
		 
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "selenium";
		 if (actualTitle.equals(expectedTitle))
		 {
			 System.out.println("verification successful correct url is opened");
		 }
		 else
		 {
			 System.out.print("verification failed incorret url"); 
		 }
	     catch(Exception ex)
	      {
		     System.out.println("error"+ expectedTitle);
	     } finally {
	       driver.close();
	}

	}}
