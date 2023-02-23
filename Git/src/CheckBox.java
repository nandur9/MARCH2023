

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String appurl ="https://courses.skillsnet.simplilearn.com/login";
		 driver.get(appurl);
		 driver.findElement(By.linkText("register-name")).click();;
		 driver.get(appurl);
		 System.out.println(driver.getTitle());
		 Thread.sleep(1000);
		 driver.findElement(By.id("register-email")).click();
		 
		 

	}

}
