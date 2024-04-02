package week2.day2;

public class Remdupwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int count=0;
     String text = " we learn java basics as part of java sessions in java week1";
     String[] split1 = text.split(" ");
     String[] split2 = text.split(" ");
     String res="";
     
     for(int i =0;i<=split1.length-1;i++) 
		{
			System.out.println(split1[i]);
			
		}
    // String array1=split1[i];
     //String array2=split2[j];
     
     for(int i =0;i<=split1.length-1;i++) 
		{
    		res = res+split1[i];	
    	 for(int j =i+1;j<=split2.length-1;j++) 
 		{
 			if(res==split2[j]) 
 			{
 				count=count+1;
 				System.out.println("Match word found "+ split1[i]);
 			}
 			
 			//String replaceString = split1.replaceAll("java"."  ");
 			//System.out.println();
		}
		}
         
	}

     
     
	  
  
      
	}


