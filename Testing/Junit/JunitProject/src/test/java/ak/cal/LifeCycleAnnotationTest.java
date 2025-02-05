package ak.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LifeCycleAnnotationTest {
	
	LifeCycleAnnotation lifeCycleAnnotation ;
	/*
	 * @BeforeAll static void beforeAll() {
	 * 
	 * System.out.println("this will run before all the methods");
	 * 
	 * }
	 * 
	 * @AfterAll static void afterAll() {
	 * System.out.println("this will run at Last");
	 * 
	 * }
	 * 
	 * @BeforeEach void init() {
	 * 
	 * lifeCycleAnnotation = new LifeCycleAnnotation();
	 * 
	 * }
	 * 
	 * @AfterEach void cleanUp() {
	 * 
	 * lifeCycleAnnotation = null; System.out.println("Clean Up Now"); }
	 * 
	 * @Test void testSquare() {
	 * 
	 * int expected = 25; int actual = lifeCycleAnnotation.square(5);
	 * 
	 * assertEquals(expected,actual); }
	 * 
	 * @Test void testCube() {
	 * 
	 * int expected = 125; int actual = lifeCycleAnnotation.cube(5);
	 * 
	 * assertEquals(expected,actual,"Pass"); }
	 * 
	 * @Test void testPositive() {
	 * 
	 * int expected = 25; int actual = lifeCycleAnnotation.cube(5);
	 * 
	 * assertEquals(expected,actual,"Pass"); }
	 */
	
	@Nested
	class testPositiveNmuber{
		
		@BeforeEach 
		void init() {
			  
			  lifeCycleAnnotation = new LifeCycleAnnotation();
			  
		}
		
		//@Test
		void testPositiveNo() {
			
			assertEquals(2,lifeCycleAnnotation.positive(2, 2),"Should return a positive number");
			
		}
		@Test
		void testNegetiveNo() {
			int expected = -2;
			int actual = lifeCycleAnnotation.positive(-2,-2);
			
			assertEquals(expected,actual,() -> "should return a -ve value ");

		}
		
	}
	
	
}
