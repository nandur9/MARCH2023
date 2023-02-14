
public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org = "selenium is used for UI";
		String search = "UI";
		String replace = "API";
		String result;
		result =org;
		int i;
		do
		{
			System.out.println("Original string:"+org);
			i = org.indexOf(search);
			if (i!=-1)
			{
				result = org.substring(0,i);
				result = result+replace;
				result = result+org.substring((i+search.length()));
				org=result;
				
			}
		}while(i!=-1);
		System.out.println("replaced string:"+org);
			
		}

	}


