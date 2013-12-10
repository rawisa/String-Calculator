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
	
	@org.junit.Test
	public void RandomDelimeter(){
		assertEquals(1+2+3+4,calc.add("//;\n1;2;3;4"));
	}
	
	@org.junit.Test
	public void RandomDelimeterWithSpecialChar(){
		assertEquals(1+2,calc.add("//.\n1.2"));
	}
	
	@org.junit.Test
	public void DontAllowMinusNumbers(){
		try{
			calc.add("-1,2,3");
			fail("Shouldnt accept minus");
		}catch(Exception ex){
			
		}
	}
}
