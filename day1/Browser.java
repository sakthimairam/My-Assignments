package week3.day1;

public class Browser {
	String browsername="Chrome";
    int browserversion=123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Browser obj=new Browser();
     obj.openURL();
     obj.navigateBack();
     obj.closeBrowser();
     System.out.println("browsername "+obj.browsername);
}
	public void openURL() 
    {
   	 System.out.println("Open URL");
    }
    
    public void closeBrowser() 
    {
   	 System.out.println("close the Browser"+browsername);
    }
	
	public void navigateBack() 
	{
		System.out.println("Navigate back to existing"+ browsername);
	}

}