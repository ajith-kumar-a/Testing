package ak.cal;

public class AmazonCreateHomePAge {

	
	public String YourName(String FirstName,String LastName) {
		
		if(FirstName.trim() == "" || LastName.trim() == "")
			return "Error";
		
		return FirstName+" "+LastName;
	}
	
	public String EmailandContact(long expectedNum,String emailID) {
		
		if(!checkNum(expectedNum))
			return "Mobile Number Error";
		
		if(emailID.trim() == "")
			return "Email Error";

		return (expectedNum +" "+emailID);
	}
	

	private boolean checkNum(long expectedNum) {
		
		String num = ""+expectedNum;
		
		if(num.length() != 10)
			return false;
		
		return true;
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
