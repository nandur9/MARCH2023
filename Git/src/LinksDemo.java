

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String appurl ="https://courses.skillsnet.simplilearn.com/login";
		 driver.get(appurl);
		 driver.findElement(By.linkText("login-help")).click();;
		 driver.get(appurl);
		 System.out.println(driver.getTitle());

	}

}
