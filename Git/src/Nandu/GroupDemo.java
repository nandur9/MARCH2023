package Nandu;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(priority=1,groups="Module01")
  public void Testcase01() {
	  System.out.println("Executing method 01");
  }
  @Test(priority=3,groups="Module01")
  public void Testcase02() {
	  System.out.println("Executing method 02");
  }
  @Test(priority=2,groups="Module01")
  public void Testcase03() {
	  System.out.println("Executing method 03");
  }
  @Test(priority=5,groups="Module02")
  public void Testcase04() {
	  System.out.println("Executing method 04");
  }
  @Test(priority=4,groups="Module02")
  public void Testcase05() {
	  System.out.println("Executing method 05");
  }
  @Test(priority=6,groups="Module03")
  public void Testcase06() {
	  System.out.println("Executing method 06");
  }
  @Test(priority=7,groups="Module03")
  public void Testcase07() {
	  System.out.println("Executing method 07");
  }
  @Test(priority=8,groups="Module03")
  public void Testcase08() {
	  System.out.println("Executing method 08");
  }
}
