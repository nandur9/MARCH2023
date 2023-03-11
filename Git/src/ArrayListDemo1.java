import java.util.ArrayList;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("MAHANDRA");
		cars.add("MARUTHI");
		cars.add("KIA");
		/*
		 for(int =i=0;i< cars.size(); i++)
		 {
			System.out.println(cars.get(i));
		 }
	*/
		for (String i:cars)
		{
			System.out.println(i);
		}
	}

}
