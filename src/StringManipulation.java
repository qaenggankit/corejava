
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ankit sharma";
		
//		System.out.println(str.length());
//		
////		System.out.println(str.indexOf("name"));
//		System.out.println(str.indexOf('n'));
//		
//		System.out.println(str.indexOf('n', (str.indexOf('n')+1)));
//		
//		System.out.println(str.indexOf('n', str.indexOf(str.indexOf('n')+1)+1));
		
		String date = "11-12-2018";
		
		System.out.println(date.replaceAll("-", "/"));
		
		String abc = "hello_world_yes";
		
		String test [] = abc.split("_");
		
		for(int i =0;i<test.length;i++)
		{
			System.out.println(test[i]);
		}
		
		
	}

}
