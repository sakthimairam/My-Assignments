package week3.day2;

public class Bank3 extends Bank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bank3 B3 = new Bank3();
     B3.Deposit(null, 0);
     B3.Saving(null, 0);
     B3.Loans(null, 0);
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
