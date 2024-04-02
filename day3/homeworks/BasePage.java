package week3.day2.homeworks;

public class BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BasePage bp=new BasePage();
     bp.FindElement();
     bp.clickElement();
     bp.EnterText();
     bp.PerformCommonTasks();
     
	}

	public void FindElement() 
	{
		System.out.println("Find the element ");
	}
	
	public void clickElement() 
	{
		System.out.println("click the element ");
	}
	
	public void EnterText() 
	{
		System.out.println("Enter the Text ");
	}
	
	public void PerformCommonTasks() 
	{
		System.out.println("Perform Common Tasks ");
	}
}
