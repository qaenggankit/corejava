
public class removeSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "2#$%#%$#@ jishn a08i0%%#$^@%";
		
	String a = 	s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(a);  
		

	}

}
