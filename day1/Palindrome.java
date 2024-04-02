package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name = "LIRIL";
    
    System.out.println("The given name is "+ name);
        
    String reverse="";
    
    int len=name.length();
    
    System.out.println("Length of the String is "+len);
    
    char[] cs = name.toCharArray();
    
    for(int i= cs.length-1;i>=0;i--) 
    {
    	reverse=reverse+cs[i];
    }
     if(reverse.equals(name)) 
     {
    	 System.out.println("The given name is Palindrome ");
     }
     else 
     {
    	 System.out.println("The given name is not a Palindrome");
     }
	}

}
