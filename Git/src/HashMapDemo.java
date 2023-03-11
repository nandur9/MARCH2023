import java.util.ArrayList;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String>capitalCities = new HashMap<String,String>();
		
		capitalCities.put("INDIA","DELHI");
		capitalCities.put("USA","WASHING DC");
		capitalCities.put("UK","LONDAN");
		capitalCities.put("GERMANY","BERLIGUM");
		
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("INDIA"));
		System.out.println(capitalCities.get("USA"));
		System.out.println(capitalCities.get("UK"));
		
		capitalCities.remove("UK");
		 System.out.println(capitalCities);
		 System.out.println(capitalCities.size());
		capitalCities.clear();
		 System.out.println(capitalCities);
		
		
		

	}

}
