
public class ExceprtionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a =args.length;
			System.out.println("value of a:"+a);
			
		int b =1/a;
		int c[] = {1,2};
		c[10] =15;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			
			System.out.println("Index is out of bounds");
		}
		System.out.println("After try / catch blocks");
		
		

	}

}
