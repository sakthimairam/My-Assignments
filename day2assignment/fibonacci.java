package week1.day2assignment;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int FN=0;
    
    System.out.println("The First Number is "+FN);
    
    int SN=1;
    System.out.println("The First Number is "+SN);
    int sum =0;
    
    int range=8;
  
    for(int i=1;i <= range;i++)
    {
    	
    	sum=FN + SN;
    	System.out.println("The Fibonacci Series are "+sum);
    	FN = SN;
    	SN=sum;
       	
    }
    
	}

}
