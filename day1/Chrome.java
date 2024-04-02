package week3.day1;

public class Chrome extends Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Chrome objchr=new Chrome();
     objchr.clearCache();
     objchr.openIncognito();
     objchr.closeBrowser();
     objchr.openURL();
     objchr.navigateBack();
     objchr.closeBrowser();
     System.out.println(objchr.browsername);
	}
	public void openIncognito() 
	{
		System.out.println("Open the Browser incognito window ");
	}
	
	public void clearCache() 
	{
		System.out.println("clearcache the window");
	}

}
