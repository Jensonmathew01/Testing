package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

public class date {

	public static String dateof(){
		Scanner in=new Scanner(System.in);
		int d;
		System.out.println("Enter the day ");
		d=in.nextInt();
		if(d>=1 && d<=80)
			return("5 gold coins");
		else if(d>81 && d<=172)
			return("3 gold coins");
		else if(d>172 && d<=266)
			 return("1 gold coins");
		else if(d>266 && d<=365)
			return("no coins");
		else
			return("Invalid input");
		}
	public static void main(String args[])
	{
		System.out.println(dateof());
	}

}
