import java.util.ArrayList;
import java.util.HashMap;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String>capitalCities = new HashMap<String,String>();
		
		capitalCities.put("INDIA","DELHI");
		capitalCities.put("USA","WASHING DC");
		capitalCities.put("UK","LONDAN");
		capitalCities.put("GERMANY","BERLIGUM");
		
		for (String i:capitalCities.keySet())
		{
			System.out.println(i);
			System.out.println("xxxxx HashMap key --> values");
		}
		  for (String i:capitalCities.keySet())
        {
        	System.out.println("" + i + "--> :" + capitalCities.get(i));
        }


	}

}

