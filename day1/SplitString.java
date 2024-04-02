package week2.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="I Like Pongal";
		String[] Sp = text.split(" ");
		for(int i =0;i<=Sp.length-1;i++) 
		{
			System.out.println(Sp[i]);
		}
		
		int len = Sp.length;
		System.out.println("The lenght "+len);
	}

}
