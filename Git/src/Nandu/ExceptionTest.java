package Nandu;

import java.io.IOException;
import org.testng.annotations.Test;

public class ExceptionTest {
  @Test(expectedExceptions=IOException.class)
  public void testone() throws Exception{
	  throw new IOException();
  }
  
  @Test(expectedExceptions={IOException.class,NullPointerException.class})
  public void testtwo() throws Exception{
	  throw new Exception();
  }
}
