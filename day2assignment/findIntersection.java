package week1.day2assignment;

public class findIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] m = {3, 2, 11, 4, 6, 7};
		int[] n = {1,2, 8, 4, 9, 7};
		for(int i=1;i<m.length;i++)
        {
			for(int j=1;j<n.length;j++)
			{
				if(m[i]==n[j])
				{
					System.out.println("The intersect numbers are equal " +n[i] );
				}
			}
		}
		
		
		
		
		
		
		
		

	}

}
