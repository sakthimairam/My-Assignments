package week3.day1;

public class Edge extends Chrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Edge objedge=new Edge();
     objedge.takesnap();
     objedge.clearcookies();
     objedge.clearCache();
     objedge.openIncognito();
     objedge.openURL();
     objedge.closeBrowser();
     objedge.navigateBack();
    
     System.out.println(objedge.browsername);
	}
	public void takesnap() 
	{
		System.out.println("Screenshot ");
	}
	
	public void clearcookies() 
	{
		System.out.println("clearcookies the window");
	}
}
