package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class testvehicle {
	
	@Test
	public void testvehicles()
	{
		String expected="Kerala Thiruvalla";
		String actual=vehicle.vehicles("KL07A3345");
		assertEquals(expected,actual);
	}

}
