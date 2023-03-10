package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class countvowelstest {

	 

	 @Test

	 public void counttesting() {

	 

	 String input ="sharath";
	 int expected=2;
	 int actual=vowels.vowelscount(input);

	 assertEquals(expected,actual);
	 

	 }
}
