package ustbatchno3.junit5testcases;
import java.util.*;
import java.util.stream.Collectors;
public class vehicle {

	public static String vehicles(String string) {
	  Scanner in=new Scanner(System.in);	
	  int i;
	  String num,str1 = null,str2=null,str3=null;
	 // List<String> a=Arrays.asList("KL07A3345","KL27B7654","KL09C4532","TN0T5647");
	  //List<String> b=a.stream().filter(t->t.charAt(0)=='K' && t.charAt(1)==('L')).collect(Collectors.toList());
	  //System.out.println(b);
	  System.out.println("Enter the given registration number in the given list(KL07A3345,KL27B7654,KL09C4532)");
	  System.out.println("Enter the registration number ");
	  num=in.nextLine();
	  if(num.charAt(0)=='K' && num.charAt(1)=='L')
	  {
	    if(num.equals("KL07A3345"))
	    {
	    	str1="Kerala Thiruvalla";
	    	System.out.println(str1);
	    }
	    else if(num.equals("KL27B7654"))
	    {
	    	str2="Kerala Trivandrum";
	    	System.out.println(str2);
	    }
	    else if(num.equals("KL09C4532"))
	    {
	    	str3="Kerala Ernakulam";
	    	System.out.println(str3);
	    }
	    else
	    	System.out.println("Invalid input");
	  }
	  else
		  System.out.println("Invalid registration number");
	 // List<String> c=b.stream().filter(t->t.charAt(2)=='2' && t.charAt(3)==('7')).map(t->t+ " Kerala Thiruvalla").collect(Collectors.toList());
	 // List<String> d=b.stream().filter(t->t.charAt(2)=='0' && t.charAt(3)==('7')).map(t->t+ " Kerala Ernakulam").collect(Collectors.toList());
	//  List<String> e=b.stream().filter(t->t.charAt(2)=='0' && t.charAt(3)==('9')).map(t->t+ " Kerala Trivandrum").collect(Collectors.toList());
	  //System.out.println(c);
	 // System.out.println(d);
	  //System.out.println(e);
	return str1;

	}
	public static void main(String args[])
	{
		System.out.println(vehicles(null));
	}
	
	
}
