package week2.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String name = "Sakthi";
		char[] charArray=name.toCharArray();
		//name.to ---it will give name.toCharArray() then click CTRL +2 then select Assign to local variable option
		//char[] cs = name.toCharArray();
		
		System.out.println("The Given name is "+name);
		
		int len = name.length();
		System.out.println("The length of the string is "+len);
		
		for(int i=len-1;i>=0;i--)
        {
        	System.out.println("Reverse String is "+ charArray[i]);
        }
		
		
	}

}
