
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  char []c = {'j','a','v','a'};
		  String s1 =new String(c);
		  String s2 =new String(s1);
		  String s3 ="Java";
		  System.out.println(c);
		  System.out.println(s1);
		  System.out.println(s2);
		  System.out.println("Length is :" +s2.length());
		  System.out.println("charcter at index 1: "+s2.charAt(1));
		  System.out.println(s1.equals(s2));
		  System.out.println(s1.equals(s3));
		  System.out.println(s1.equalsIgnoreCase(s3));

	}

}
