
class ExceptionDemo1  {
	static void computer(int a) throws UserDefinedEXception
	{
		System.out.println("called computer method"+a);
		if(a > 10) {
			throw new UserDefinedEXception(a);
		}
		System.out.println("Exit from program");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			computer(1);
		}
		catch(UserDefinedEXception e)
		{
			System.out.println("Handled user defined Exception");
			e.printStackTrace();
		}

	}
}
