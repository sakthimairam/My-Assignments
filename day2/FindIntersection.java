package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int set1[] = {3,2,11,4,6,7};
   int set2[] = {1,2,8,4,9,7};
   int len1=set1.length;   
   int len2=set2.length;
   int sum1=0;
   int sum2=0;
   for(int i=0;i<=len1-1;i++) 
   {
	   for(int j=0;j<=len2-1;j++) 
	   {
	      if(set1[i]==set2[j])
		   {
			   System.out.println("The numbers are intersect "+set1[i]);
		   
	        }
	   }
   }
	   }
   }
   
  


