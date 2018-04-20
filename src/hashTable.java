import java.util.HashMap;
import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		
		
		Hashtable h = new Hashtable();
		
		h.put("a","aasdwf");
		h.put("2", "Ajjbhfk");
		h.put("1233", "111");
		
		h.put(1, "Hello");
		
		
		int b = h.size();
		//System.out.println(b);
		
		System.out.println(h.get(1));
		
		HashMap h1 = new HashMap();
		
		h1.put(1, 11);
		
		System.out.print(h);
		
	}

}
