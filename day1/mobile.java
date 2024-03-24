package week1.day1;

public class mobile {
	
	public void makecalls() 
	{
		String mobileModel= "IPHONE";
		float mobileWeight = 0.300f;
	System.out.println("The Mobile Model is " + mobileModel);	
	System.out.println("The Mobile weight is " + mobileWeight);	
		
	}
	public void sendMsgs() 
	{
		boolean isFullyCharged = true;
		int mobileCost = 60000;
	System.out.println("The Mobile battery is fully charged "+isFullyCharged);	
	System.out.println("The cost of the Mobile is "+ mobileCost);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      mobile myMobile = new mobile();
      System.out.println("This is my Mobile details as ");
      myMobile.makecalls();
      myMobile.sendMsgs();
      
	}

}
