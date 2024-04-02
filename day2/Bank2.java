package week3.day2;

public class Bank2 extends Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bank2 B2=new Bank2();
     B2.Deposit("Govind", 1500);
     B2.Saving("Hariharan",1600);
     B2.Withdraw("Ganesan",1520);
     B2.Loans("Chitra",6100);
	}

	public void Deposit(String name,int Accno) 
	{
		System.out.println("Deposit  " +name+ "," +Accno);
	}
	public void Saving(String name,int Accno) 
	{
		System.out.println("Saving  " +name+ "," +Accno);
	}
	public void Loans(String name, int Accno) 
	{
		System.out.println("Loans are " + name + "," +Accno );
	}
	
}
