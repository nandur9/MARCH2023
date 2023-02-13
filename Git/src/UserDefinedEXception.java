
public class UserDefinedEXception extends Exception {
	
	private int detail;
	UserDefinedEXception(int a)
	{
		detail = a;
	}
	public String tostring()
	{
		return"My Exception["+ detail+"]";
	}
}


