package Nandu;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {
   @DataProvider(name="browserdata")
   public Object[][] dataProviderMethod()
   {
	   return new Object[][] {{"chrome"},{"firefox"},{"safari"},{"ie"}};
   }
	
	@Test(dataProvider="browserdata")
  public void testMethod(String browserdetails) {
		System.out.println("Brwoser executed :" + browserdetails);
	}
}
