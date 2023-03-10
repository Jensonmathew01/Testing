package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

public class testeachwordcount {
	
	@Test
	public void testword()
	{
	

		List<String> words=Arrays.asList("apple","orange","grapes","apple","grapes");

		 Map<String,Long> expected=new HashMap<>();
		 expected.put("apple",(long) 2);
		 expected.put("orange",(long) 1);
		 expected.put("grapes",(long) 2);
          System.out.println(expected);
		 Map<String,Long> actual=counteachvalue.each();

		 assertEquals(expected,actual);
}
   
		
	}

