import static org.junit.Assert.*;

import com.rawi.Calculator;


public class Test {
	Calculator calc = new Calculator();

	@org.junit.Test
	public void WillItReturnZero() throws Exception{
		assertEquals(0,calc.add(""));
	}
	
	@org.junit.Test
	public void ShouldReturnTheNumberItSelf() throws Exception{
		assertEquals(1,calc.add("1"));
	}
	
	@org.junit.Test
	public void ShouldReturnTheSumOfTwoNumbersSplittedByComma() throws Exception{
		assertEquals(3,calc.add("1,2"));
	}
	
	@org.junit.Test
	public void ShouldReturnTheSumOfMoreThanTwoNumbersSplittedByComma() throws Exception{
		assertEquals(6,calc.add("1,2,3"));
	}
	
	@org.junit.Test
	public void AddingANewLineDelimeter() throws Exception{
		assertEquals(6,calc.add("1,2\n3"));
	}
	
	@org.junit.Test
	public void RandomDelimeter() throws Exception{
		assertEquals(1+2+3+4,calc.add("//;\n1;2;3;4"));
	}
	
	@org.junit.Test
	public void RandomDelimeterWithSpecialChar() throws Exception{
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
	
	@org.junit.Test
	public void shouldPrintMinusNumbers(){
		try{
			calc.add("-1,2,3");
			fail("Shouldnt accept minus");
		}catch(Exception ex){
			assertEquals("-1 ",ex.getMessage());
		}
	}
}
