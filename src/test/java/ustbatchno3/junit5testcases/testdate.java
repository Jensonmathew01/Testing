package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.stream.IntStream;

import org.junit.Test;

public class testdate {
	
	@Test
	public void dates(){
		String expect1="5 gold coins";
		String expect2="3 gold coins";
		String expect3="1 gold coins";
		String expect4="no coins";
		String actual=date.dateof();
	    assertEquals(actual,expect4);
	    
	    
		
	}
    

}
