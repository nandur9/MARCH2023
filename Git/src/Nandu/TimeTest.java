package Nandu;

import org.testng.annotations.Test;

public class TimeTest {
  @Test
  public void Testone() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("Test method one called");
  }
  @Test
  public void Testtwo() throws InterruptedException {
	  Thread.sleep(400);
	  System.out.println("Test method two called");
  }
}
