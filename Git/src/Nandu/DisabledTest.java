package Nandu;

import org.testng.annotations.Test;

public class DisabledTest {
	@Test(enabled=true)
	  public void testMethodone() {
		   System.out.println("test method one");
	  }
	@Test(enabled=false)
	  public void testMethodtwo() {
		   System.out.println("test method two");
	  }
	@Test(enabled=true)
	  public void testMethodthree() {
		   System.out.println("test method three");
	  }
}
