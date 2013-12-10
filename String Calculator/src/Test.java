import static org.junit.Assert.*;

import com.rawi.Calculator;


public class Test {
	Calculator calc = new Calculator();

	@org.junit.Test
	public void WillItReturnZero(){
		assertEquals(0,calc.add(""));
	}
	
	@org.junit.Test
	public void ShouldReturnTheNumberItSelf(){
		assertEquals(1,calc.add("1"));
	}
	
	@org.junit.Test
	public void ShouldReturnTheSumOfTwoNumbersSplittedByComma(){
		assertEquals(3,calc.add("1,2"));
	}
	
	@org.junit.Test
	public void ShouldReturnTheSumOfMoreThanTwoNumbersSplittedByComma(){
		assertEquals(6,calc.add("1,2,3"));
	}
	
	@org.junit.Test
	public void AddingANewLineDelimeter(){
		assertEquals(6,calc.add("1,2\n3"));
	}
}
