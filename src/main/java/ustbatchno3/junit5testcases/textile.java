package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;;

public class textile {

	public static List<String> date(LocalDate date)
	{
	 Scanner in=new Scanner(System.in);
	 List<String> a=Arrays.asList("Tshirt","50","5000");
	 List<String> b=Arrays.asList("Jeans","30","15000");
	 List<String> c=Arrays.asList("Shirt","10","10000");
	 Map<LocalDate,List<String>> A=new HashMap<>();	
	 A.put(LocalDate.of(2022, 12, 3),a);
	 A.put(LocalDate.of(2022, 11, 3),b);
	 A.put(LocalDate.of(2022, 10, 3),c);
	 for (Map.Entry<LocalDate,List<String>> entry : A.entrySet()) //using map.entrySet() for iteration  
	   if(entry.getKey().equals(date))
	        return(entry.getValue());
	 return null;
	}
	public static void main(String args[])
	{
		System.out.println(date(LocalDate.of(2022, 10, 3)));
	}

}
