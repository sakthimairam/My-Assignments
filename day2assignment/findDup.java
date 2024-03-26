package week1.day2assignment;

import java.util.Arrays;

public class findDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {1,2,3,4,5,6,7,1,2,3};
		
		int len=num.length;
		
		for(int i=0;i<len;i++)
		{
		 for(int j=i+1;j<len;j++) 
		 {
			if(num[i]==num[j]) 
			{
				System.out.println("The number is Duplicate "+num[i]);
			} 
		 }
		}
	}

}
