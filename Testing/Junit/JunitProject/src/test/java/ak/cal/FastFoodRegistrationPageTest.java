package ak.cal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class FastFoodRegistrationPageTest {
	
	FastFoodRegistrationPage fastFoodRegistrationPage;
	Scanner sc;
	
	@BeforeEach 
	void init() {
		  
		fastFoodRegistrationPage = new FastFoodRegistrationPage();
		sc = new Scanner(System.in);
	}

	@Test
	void testUserName() {
		
		
		String expectedName = "Ajith Kumar";
		System.out.print("Enter First Name : ");
		String FirstName = sc.nextLine();
		System.out.print("Enter Last Name : ");
		String LastName = sc.nextLine();
		String actualName = fastFoodRegistrationPage.UserName(FirstName , LastName);
		
		assertEquals(expectedName,actualName);
		
	}
	
	@Test
	void testContactNumber() {
		
		String expectedContact = "ContactNum : 9380410103";
		System.out.print("Enter Contact Number  : ");
		String Number = sc.nextLine();
		String actualContact = fastFoodRegistrationPage.ContactNumber(Number);
		
		assertEquals(expectedContact,actualContact);
		
	}
	@Test
	void testEmailId() {
		
		
		String expetedEmailId = "abcd@gmail.com";
		
		String actualResult = fastFoodRegistrationPage.EmailId(expetedEmailId);
		
		assertEquals(expetedEmailId,actualResult);
		
		assertAll(
				() -> assertEquals("xyz@gmail.com",fastFoodRegistrationPage.EmailId("xyz@gmail.com")),
				() -> assertEquals("def@gmail.com",fastFoodRegistrationPage.EmailId("def@gmail.com")),
				() -> assertEquals("hello@gmail.com",fastFoodRegistrationPage.EmailId("hello@gmail.com"))
				);
	}
	
	
	@Test
	void testPassword() {
		
		String ValidPass = "123456";
		boolean isvalid = fastFoodRegistrationPage.CheckPassword(ValidPass);
		
		assertTrue(isvalid,"Password must be 6 charchter");
		
		
	}
	
	String  testInValidPassword() {
		
		String shortPassword = "12345";
		String longPassword = "1234567";
		String isValid = "123456";

		
		String expected = "123456";
		String actual = "123456";
		
		assertFalse(checkPasswordLen(shortPassword),"Password must be 6 charchter");
		assertFalse(checkPasswordLen(longPassword),"Password must be 6 charchter");
		
		assertEquals(expected,actual);
		
		if(isValid.length() == 6) {
			assertSame(expected,actual);
		}else
			return shortPassword+" "+longPassword;
		
		return null;
	}
	
	boolean checkPasswordLen(String str) {
		
		return str.length() == 6;		
	}
	
	TestInfo testinfo;
	TestReporter testReporter;
	
	@Test
	@Tag("hi")
	@Tag("testContactNumber")
	@Tag("testEmailId")
	@Tag("testPassword")
	void init1(TestInfo testinfo,TestReporter testReporter) {
		
		this.testinfo = testinfo;
		this.testReporter = testReporter;
		testReporter.publishEntry("Tested All FastFood CreateAnAccount Fields sucessfully " +testinfo.getTags());
		
	}

}
