package swengCalc2;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class CalculatorTest {

	
	
	
	
	@Test 
	public void testadd() {
		
		Calculator calc =new Calculator();
		String expectedResult ="100.0";
		String in = "50+50";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}

	@Test
	public void testminus() {
		
		Calculator calc =new Calculator();
		String expectedResult ="10.0";
		String in = "100-90";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
	@Test 
		public void testMul() {
		
		Calculator calc =new Calculator();
		String expectedResult ="100.0";
		String in = "10*10";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
	@Test 
		public void testDivide() {
		
		Calculator calc =new Calculator();
		String expectedResult ="5.0";
		String in = "50/10";
		
		assertEquals(calc.equate(in), expectedResult);
	
	}
	
	@Test
	public void testNeg() {
		
		Calculator calc =new Calculator();
		String expectedResult ="-100.0";
		String in = "100-200";
		
		assertEquals(calc.equate(in), expectedResult);
		
	}
	
	
	@Test 
		public void testInput1() {
		
		Calculator calc =new Calculator();
		String expectedResult ="125.0";
		String in = "100+50/2";
		
		assertEquals(calc.equate(in), expectedResult);
	
	}
	@Test 
		public void testInput2() {
			
			Calculator calc =new Calculator();
			String expectedResult ="1400.0";
			String in = "100+52*25";
			
			assertEquals(calc.equate(in), expectedResult);
		
	}
	
	@Test 
		public void testDecimal1() {
			
			Calculator calc =new Calculator();
			String expectedResult ="218.5";
			String in = "118.0+100.5";
			
			assertEquals(calc.equate(in), expectedResult);
		
	}
	
	
	
	
	@Test 
		public void testDecimal2() {
			
			Calculator calc =new Calculator();
			String expectedResult ="6.5";
			String in = "3.25+3.25";
			
			assertEquals(calc.equate(in), expectedResult);
		
	}
	
	
	
	
}