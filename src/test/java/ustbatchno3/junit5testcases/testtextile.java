package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class testtextile {
	
	@Test
	public void testtextiles()
	{
		 List<String> expected=Arrays.asList("Tshirt","50","5000");
		 List<String> actual=textile.date(LocalDate.of(2022, 12, 3));
		 assertEquals(expected,actual);
		 
		
		 
	}

}
