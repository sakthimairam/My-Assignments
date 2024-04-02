package week2.day2;

import java.util.Arrays;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int num[]= {1,4,3,2,8,6,7};
     
     Arrays.sort(num);
     
     System.out.println(num.length);
     
     for(int i=0;i<num.length;i++) 
     {
    	 int j=i+1;
    	 
    	 if(num[i]!=j) 
    	 {
    		System.out.println("The Missing number in an array is "+ num[i]); 
    		break;
    	 }
    	 
     }
     
     
	}

}
