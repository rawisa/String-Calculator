import static org.junit.Assert.*;

import com.rawi.Calculator;


public class Test {

	@org.junit.Test
	public void WillItReturnZero(){
		assertEquals(0,Calculator.add(""));
	}
	
}
