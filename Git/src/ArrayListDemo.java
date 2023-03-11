import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("MAHANDRA");
		cars.add("MARUTHI");
		cars.add("KIA");
		System.out.println(cars);
		System.out.println(cars.get(0));
		
		cars.set(0,"KAVASAKI");
		System.out.println(cars);
		
		cars.remove(0);
		System.out.println(cars);
		
		cars.clear();
		System.out.println(cars);
	}

}
