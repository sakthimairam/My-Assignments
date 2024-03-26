package week1.day2assignment;

import java.util.Arrays;

public class FindFirstMissingElementsInAnArray {
	
public static void main(String[] args) {
	
	int sum1=0;
	int sum2=0;
	int[] num = {1,2,3,4,7,6,8};
	Arrays.sort(num);
	int len = num.length;
	System.out.println("The Size of the array is" +len);
	
	for(int i=0;i<len;i++) 
	{
		sum1 =sum1+num[i];
		}
		
	
		for(int j=0;j<=len;j++) 
		{
			sum2 = sum2+j;
		} 
	
		System.out.println("The missing number is" + (sum2-sum1));
		
		}
	
}
	

