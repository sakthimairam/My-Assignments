package week3.day2.homeworks;

public class JavaConnections extends MySqlConnection  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JavaConnections Jc = new JavaConnections();
      Jc.connect();
      Jc.disconnect();
      Jc.executeUpdate();
    		  
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");	
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute and Update");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		
	}

     
	}


