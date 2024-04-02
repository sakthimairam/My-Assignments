package week3.day2.homeworks;

public class ConcreteClass implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConcreteClass Cc= new ConcreteClass();
     Cc.connect();
     Cc.disconnect();
     Cc.executeUpdate();
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
		System.out.println("Execute and update");
	}

	
}
