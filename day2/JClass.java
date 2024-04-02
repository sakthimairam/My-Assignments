package week3.day2;

public class JClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JClass JC=new JClass();
     JC.reportstep("Welcome", "Done");
     JC.reportstep("Start", "InProgress",true);
	}

	public void reportstep(String msg,String Status) 
	{
		System.out.println("Print the Message" +msg);
		System.out.println("Print the status"+Status);
	}
	public void reportstep(String msg,String Status,boolean snap) 
	{
		System.out.println("Print the Message"+msg);
		System.out.println("Print the status"+Status);
		System.out.println("Print Snap"+snap);
	}
}

