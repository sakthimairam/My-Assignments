package week1.day2assignment;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=34843;
		int original;
		original =num;
		int reverse=0;
		int remember;
		while (num!=0) 
		{
			remember = num%10;
			reverse=reverse*10+remember;
			num=num/10;
		}
		
		if(original==reverse) 
		{
			System.out.println("The given number is Palindrome");
			
		}
		else 
		{
			System.out.println("The Given number is not Palindrome");
		}
	}

}
