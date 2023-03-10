package ustbatchno3.junit5testcases;
import java.util.*;
public class listcount {
	public static int count(String str)
	{
		List<String> arr=new ArrayList<String>();
		arr.add("apple");
		arr.add("orange");
		arr.add("apple");
		return(Collections.frequency(arr,str));
	}
	public static void main(String args[])
	{
		System.out.println(count("apple"));
	}
		
}
	


