package ak.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorProjectTest {
	int num1 = 2,num2 = 29;
	CalculatorProject cal = new CalculatorProject();

	@Test
	void addtest() {
		
		int expected = 2;
		int actual = cal.add(1, 1);
		
		assertEquals(expected,actual,"Add Function can calculate two integer");
		
	}
	
	@Test
	void subTest() {
		
		int expected = -27;
		int actual = cal.sub(num1, num2);
		
		assertEquals(expected,actual,"Sub Function can calculate two integer");
	}
	
	@Test
	void mulTest() {
		
		int expected = 58;
		int actual = cal.mul(num1, num2);
		
		assertEquals(expected,actual,"Mul Function can calculate two integer");
		
		
	}
	
	@Test
	void divTest() {
		assertThrows(NullPointerException.class, () -> cal.div(5, 1),"Div Function can calculate two integer");
		
	}
	
	@Test
	void AreaOfCircleTest() {
		
		assertEquals(314.1592653589793,cal.AreaOfCircle(10));
		
		assertEquals(706.8583470577034,cal.AreaOfCircle(15));
	}
	
	@Test
	void PositiveNumTest() {
		
		int i = -2;
		
			
		
		assertEquals(true,cal.positiveNumber(2));
		
	
		
	}

}
