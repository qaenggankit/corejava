import java.util.HashSet;
import java.util.Set;

public class duplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String names[] = {"hello", "java","really","java","really","string"};
		
//		for(int i=0;i<names.length;i++)
//		{
//			for(int j = i+1;j<names.length;j++)
//			{
//				if(names[i].equals(names[j]))
//				{
//					System.out.println("Duplicate entry is : " + names[i]);
//				}
//			}
//		}
		
		Set<String> store = new HashSet<String>();
		for(String name : names)
		
		if(store.add(name)==false)
		{
			System.out.println("duplicate entry is " + name);
		}
	}


}
