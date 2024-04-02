package week2.day2;

public class FindoddIndexUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String test="changeme";
     System.out.println("The Given String is "+test);
     
     char[] cs = test.toCharArray();
     char ch;
     System.out.println("length is "+cs.length);
     
    for(int i=0;i<cs.length;i++) 
     {
    	if((i%2)!=0)
    			 {   
    		       
    		       System.out.println("Index is ODD " + i);
    		        ch = Character.toUpperCase(cs[i]) ;
    		        System.out.println("Convert to Uppercase  "+ch);
    			 }
	}
	}
}



