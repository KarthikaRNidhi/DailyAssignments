package week3.day2;

public class LoginTestData extends TestData {
	 
	public void enterUserName()
	{
		System.out.println("Enter username");
	}
	public void enterPassword()
	{
		System.out.println("Enter password");
	}

	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.enterPassword();
		login.navigateToHomePage();

	}

}
