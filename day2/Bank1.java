package week3.day2;

public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bank1 B1=new Bank1();
     B1.Saving("Sakthi",1001);
     B1.Deposit("Harini", 1200);
     B1.Withdraw("Siva",1300);
	}

	public void Deposit(String name,int Accno) 
	{
		System.out.println("Deposit  " +name+ "," +Accno);
	}
	public void Saving(String name,int Accno) 
	{
		System.out.println("Saving  " +name+ "," +Accno);
	}
	public void Withdraw(String name, int Accno) 
	{
	System.out.println("Withdraw  " +name+ "," +Accno);
     }
}
