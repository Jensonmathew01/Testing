package ustbatchno3.junit5testcases;
public class vowels {

	public static int vowelscount(String str) {
		int count=0,i;
	    for(i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	    		count++;
	    }
	    return count;

	}
	public static void main(String args[])
	{
		System.out.println(vowelscount("sharath"));
	}

	

}
