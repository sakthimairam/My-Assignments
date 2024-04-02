package week3.day2.homeworks;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     APIClient cl=new APIClient();
     cl.sendRequest("Call");
     cl.sendRequest("Call", "Welcome to TestLeaf",true);
	}
	
public void sendRequest(String endpoint) 
{
	System.out.println("Please send the request " +endpoint);
}

public void sendRequest(String endpoint,String requestBody,boolean requestStatus) 
{
	System.out.println("Please send the request " +endpoint);
	System.out.println("Body of the request " + requestBody);
	System.out.println("The Request status is "+requestStatus);
}


}