import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>myNumbers = new ArrayList<Integer>();
		
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    myNumbers.add(30);
	   
		/*
		for (Integer i:myNumbers)
		{
			System.out.println(i);
	    }*/
		  Collections.sort(myNumbers);
		  
		   System.out.println(" xxxxx  After sorting   xxxxxx ");
		  
		  for (Integer i: myNumbers)
		  {
			  System.out.println(i);
		  }
		
	}

}
