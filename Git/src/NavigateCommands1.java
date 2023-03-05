
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NavigateCommands1 {

	private static final String Try = null;

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		System.setProperty("/home/nandur9gmail/eclipse-workspace/Wheel", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String appurl ="https://www.google.com/";
		 driver.navigate().to(appurl);
		 Thread.sleep(2000);
		 appurl = "https://www.amazon.com/";
		 driver.get(appurl);
	      Try {
			 File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 File DestFile = new File("File name local\\sample.png");
			 Files.copy(srcfile,DestFile);
			 driver.navigate().back();
			 Thread.sleep(2000); 
			 driver.navigate().forward();
			 
			 
		 }

	}

}
