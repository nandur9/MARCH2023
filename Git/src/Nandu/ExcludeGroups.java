package Nandu;
import org.testng.annotations.Test;

public class ExcludeGroups {
  @Test(groups="group1")
  public void testMethodone() {
	   System.out.println("test method one belongs to include group");
  }
  @Test(groups="group1")
  public void testMethodtwo() {
	   System.out.println("test method two belongs to include group");
  }
  @Test(groups={"group1","group2"})
  public void testMethodthree() {
	   System.out.println("test method three belongs to 2 groups");
  }
  @Test(groups={"regression","group2"})
  public void testMethodFour() {
	   System.out.println("test method four belongs to 2 groups");
  }
}
