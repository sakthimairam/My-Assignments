package week3.day1;

public class LoginTestData extends TestData {
String username ="Sakthi";
String password="abcd";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LoginTestData Ltd=new LoginTestData();

    Ltd.enterPassword();
    Ltd.enterCredentials();
    Ltd.navigateToHomePage();
    System.out.println("Username is "+ Ltd.username);
    System.out.println("Password is "+Ltd.password);
	}
	public void enterUsername() 
	{
		System.out.println("Enter the Username" );
	}
	public void enterPassword() 
	{
		System.out.println("Enter the Password");
	}

}
