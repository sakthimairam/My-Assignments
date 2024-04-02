package week2.day1;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name = "Sakthi";
	System.out.println("The name is "+name);
	
	int len=name.length();
	System.out.println("Lenght is "+len);
	
	String Upper = name.toUpperCase();
	System.out.println("Uppercase "+ Upper);
	
	String Lower = name.toLowerCase();
	System.out.println("Lowercase is "+Lower);
	
	char[] charArray = name.toCharArray();
	for(int i=0;i<=len-1;i++)
	{
	System.out.println("print individual " +charArray[i]);
	}
	}
}
