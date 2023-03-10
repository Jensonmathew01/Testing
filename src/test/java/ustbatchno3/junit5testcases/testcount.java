package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testcount {
	
	@Test
	public void countingvowels()
	{
		String s="apple";
		int expected=2;
		int actual=listcount.count(s);
		assertEquals(expected,actual);
	}
	

}
