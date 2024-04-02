package week3.day2;

public class SonyTV implements SmartTv{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // SonyTV Stv =  new SonyTV();
     //Stv.VolIncrease();
     //Stv.ChangeChannel();
     //Stv.VolDecrease();
     //Stv.mutevolume();
     //Scope restriction
     SmartTv res = new SonyTV();
     res.ChangeChannel();
     res.mutevolume();
     res.VolIncrease();
     res.VolDecrease();

	}

	
	@Override
	public void ChangeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Change the channel");
	}

	@Override
	public void VolIncrease() {
		// TODO Auto-generated method stub
		System.out.println("Increase the volume");
	}

	@Override
	public void VolDecrease() {
		// TODO Auto-generated method stub
		System.out.println("Decrease the volume");
	}

	@Override
	public void mutevolume() {
		// TODO Auto-generated method stub
		System.out.println("Mute the volume");
	}

	@Override
	public void brightness() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contrast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sharp() {
		// TODO Auto-generated method stub
		
	}
		

}
