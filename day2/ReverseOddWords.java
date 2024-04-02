package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String test="I am a software tester";
       
       String[] split = test.split(" ");
       
       for(int i =0;i<=split.length-1;i++) 
       {
    	   System.out.println("splitted words are "+split[i]);
       }
     
      for(int i=0;i<=split.length-1;i++) 
     {
    	if((i%2)!=0)
    			 {   
    		       char[] charArray = test.toCharArray();
    		       for (int j =charArray.length-1;j>0;j--) 
    		       {
    		    	   System.out.println(charArray[j]);
    		       }}
    	else 
    		       {
    		    	   System.out.println( split[i]);
    		       }
    		     
    			 }
	}
     
        
     
	}


