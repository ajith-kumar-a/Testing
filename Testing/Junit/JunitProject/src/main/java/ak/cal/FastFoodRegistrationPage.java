package ak.cal;

public class FastFoodRegistrationPage {
	
	public String UserName(String FirstName,String LastName) {
		
		if(FirstName.trim() == "" || LastName.trim() == "")
			return "Error";
		
		return FirstName+" "+LastName;
	}
	
	public String ContactNumber(String contactNum) {
		
		if(contactNum.length() != 10)
			return "Error";
		
		return "ContactNum : "+contactNum;
	}
	
	public String EmailId(String emailId) {
		
		return "EmailId : "+emailId; 
	}
	
	public boolean CheckPassword(String pass) {
		
		return pass.length() == 6;
	}
	
	public boolean clickContinue(String name, String email, String password) {
		
		return true;
	}
	
}
