package Nandu;

import org.testng.annotations.Test;

public class TimeoutTest{
  @Test(timeOut=500)
  public void Testone() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("Test method one called");
  }
  @Test(timeOut=300)
  public void Testtwo() throws InterruptedException {
	  Thread.sleep(250);
	  System.out.println("Test method two called");
  }
}
