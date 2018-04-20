import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);

		int a = ar.size();
		//System.out.println(a);
		
		for(int b=0; b<a;b++)
		{
			System.out.println(ar.get(b));
			
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		
		
	}

}
