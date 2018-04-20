
public class twodimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public void twodarray()
	{
		String x[][] = new String[3][5];
		
	//	System.out.println(x.length); // it will  give no of rows 
		
		//System.out.println(x[1][0]);
		//System.out.println(x[1].length);
		
		x[0][0]="1";
		x[0][1]="2";
		x[0][2]="3";
		x[0][3]="4";
		x[0][4]="5";
		x[1][0]="55";
		x[1][1]="44";
		x[1][2]="32";
		x[1][3]="534";
		x[1][4]="5344";
		x[2][0]="56";
		x[2][1]="653";
		x[2][2]="67";
		x[2][3]="562";
		x[2][4]="54356";	
		
		int i = x.length;
		int k=x[0].length;
	
		for(int y=0; y<i;y++)
		{
			for(int j=0;j<k-1;j++)
			{
				System.out.println(x[y][j]);
				
			}
		}
		
	}//two d array finished
	
	public static void onedarra()
	{
		
		int u[] = new int [5];
		
		u[0]=1;
		u[1]=2;
        u[2]=3;
        u[3]=4;
        u[4]=5;
        
        for(int r=0;r<=u.length-1;r++)
        {
        	System.out.println(u[r]);
        }
        
        
        
		
	}
	
	

	
}
