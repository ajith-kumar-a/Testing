package ak.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmaxonProjectTestTest {

	@Test
	void testAmazonTagLine() {

		String excepted = "Spend less. Smile more";
		String actual = "Spend less. Smile more";
		
		assertEquals(excepted,actual);
		assertSame(excepted,actual);
	}
	
	@Test
	void testLogo() {
		String excepted = "amazon";
		String actual = "amazon";
		
		assertEquals(excepted,actual);
		assertSame(excepted,actual);

	}

}
