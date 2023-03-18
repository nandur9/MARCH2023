

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest02 {
	@Test (priority = 3)
	  public void Login() 
	  {
		  System.out.println("Executing value 01");
	  }
	   @Test (priority = 2)
      public void FoundTransfer() 
	   {
		  System.out.println("Executing value 02");
       }
	   @Test (priority = 1)
	   public void UpdateAddress() 
	   {
		  System.out.println("Executing value 03");
       }
	   @BeforeTest
	   public void LanchBrowser() {
		 System.out.println("Lanch browser");  
	   }
	   @AfterTest
	   public void CloserBrowser() {
		  System.out.println("closer browser");
	   }
    } 
