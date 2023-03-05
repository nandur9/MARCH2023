

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox1 {

	public static <webElement> void main(String[] args, WebElement txt_username) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String appurl = "https://adactinhotalapp.com/Register.php";
		 driver.get(appurl);
		 WebElement text_username = driver.findElement(By.cssSelector("#username"));
		 txt_username.sendKeys("text1");
		 driver.close();
		 

	}

}
