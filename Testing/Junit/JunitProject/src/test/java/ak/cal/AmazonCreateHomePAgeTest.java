package ak.cal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class AmazonCreateHomePAgeTest {

	AmazonCreateHomePAge amazonCreateHomePAge;
	Scanner sc;
	
	@BeforeEach 
	void init() {
		  
		amazonCreateHomePAge = new AmazonCreateHomePAge();
		sc = new Scanner(System.in);
	}
	@Test
	void testUserName() {
		
		
		String expectedName = "Ajith Kumar";
		System.out.print("Enter First Name : ");
		String FirstName = sc.nextLine();
		System.out.print("Enter Last Name : ");
		String LastName = sc.nextLine();
		String actualName = amazonCreateHomePAge.YourName(FirstName , LastName);
		
		assertEquals(expectedName,actualName);
		
	}
	
	@Test
	void testMobNoAndEmailId() {
		
		long expectedMobNo = 9380410103l;
		String expetedEmailId = "abcd@gmail.com";
		
		String actualResult = amazonCreateHomePAge.EmailandContact(9380410103l, expetedEmailId);
		
		assertEquals(expectedMobNo+" "+expetedEmailId,actualResult);
		
		assertAll(
				() -> assertEquals("9876543210 xyz@gmail.com",amazonCreateHomePAge.EmailandContact(9876543210l,"xyz@gmail.com")),
				() -> assertEquals("1234567890 def@gmail.com",amazonCreateHomePAge.EmailandContact(1234567890l,"def@gmail.com")),
				() -> assertEquals("7410258963 hello@gmail.com",amazonCreateHomePAge.EmailandContact(7410258963l,"hello@gmail.com"))
				);
	}
	

	@Test
	void testPassword() {
		
		String ValidPass = "123456";
		boolean isvalid = amazonCreateHomePAge.CheckPassword(ValidPass);
		
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

	@Test
	void testContinueButton() {
		
		String name = "Ajtih Kumar";
		String email = "Ajtih@gmail.com";
		String invalivpassword = "@2";
		String validPAssword = "Ajith!";
		
		
		boolean invalid = checkContinueButton(name,email,invalivpassword);
		
		boolean Valid = amazonCreateHomePAge.clickContinue(name, email, validPAssword);
		
		assertTrue(invalid);
		
	}
	
	

	private boolean checkContinueButton(String name, String email, String password) {
		
		if(name.trim() == "" || email.trim() == "" || password.trim() == "")
			return false;
		
		if(password.length() != 6)
			return false;
		
		
		return true;
	}
	
	TestInfo testinfo;
	TestReporter testReporter;
	
	@Test
	@Tag("testUserName")
	@Tag("testPassword")
	@Tag("testUserName")
	@Tag("testContinueButton")
	void init1(TestInfo testinfo,TestReporter testReporter) {
		
		this.testinfo = testinfo;
		this.testReporter = testReporter;
		testReporter.publishEntry("Tested All Amazon CreateAnAccount Fields sucessfuly " +testinfo.getTags());
		
	}
}
