package ak.cal;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalAssumptionsTest {
	
	ConditionalAssumptions ca = new ConditionalAssumptions();

	@Test
	@EnabledOnOs(OS.LINUX)
	void testOS() {
		System.out.println("I am on windows 11");
	}
	
	void testValue() {
		
		boolean val = false;
		assumeTrue(val);
		int excepted = 10;
		int actual = ca.value();
		assertEquals(excepted,actual);
		
	}
	
	@Test
	void testMultiply() {
		
		assertAll(
				() -> assertEquals(4,ca.multiply(2,2)),
				() -> assertEquals(0,ca.multiply(2,0)),
				() -> assertEquals(-2,ca.multiply(2,-1))
				);
		
	}

}
