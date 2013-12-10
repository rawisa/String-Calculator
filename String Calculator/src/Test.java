import static org.junit.Assert.*;

import com.rawi.Calculator;


public class Test {

	@org.junit.Test
	public void WillItReturnZero(){
		Calculator calc = new Calculator();
		assertEquals(0,calc.add(""));
	}
	
}
