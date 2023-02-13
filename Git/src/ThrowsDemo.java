
public class ThrowsDemo {

	static void throwmethodone() throws IllegalAccessException
	
	{
		System.out.println("throw method  one");
		
	}
	public static void main(String[] args) {
		try {
			throwmethodone();
			}
		 catch(IllegalAccessException e)
		{
			System.out.println("Excption has beed caught"+ e);
		}
		finally
		{
			System.out.println("End of try catch block");
			
		}

		
	}}