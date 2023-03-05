

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo1 {

	public static <webElement> void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 
		 String appurl ="https://cnbc.com/world/?region = word";
		 driver.get(appurl);
		 java.util.List<WebElement> elements = ((WebDriver) driver).findElements(By.tagName("a"));
		 System.out.println("Total numbers of elements"+elements.size());
		 
		 for(WebElement element:elements) {
			 if (element.getText().length()>0)
				 System.out.println(((WebElement) elements).getText());
		 }
		 System.out.println("driver.getCurrenturl()");
		 driver.close();
		 }
		 

	}

