package mproject;

public class Pr 
{

	public static void main(String[] args) 
	{
		String[] sony = {"Laptop","Camera","Mobiles"};
		for (String i : sony) 
		{
			System.out.println(i);	
		}
	
	//String [][] apple =  {"Laptop","Camera","Mobiles"},{"abc","bvc",""};
	
	int [][] a = {{1,2,3,4},{1,3,5}};
	for(int j=0;j<=a.length;j++)
	{
		for(int k=0;k<=a.length;k++)
		{
			System.out.println(a[j][k]);	

		}
	}
	
	String name[][] = {{"Apple", "Banana"}, {"Pork", "Beef", "Chicken"}, {"Carrots"} };
	for (int x = 0; x < name.length; x ++)
	{
	   for (int y = 0; y < name[x].length; y ++) 
	   {
	        String item = name[x][y];
	        System.out.println( item );
	    }
	}	
	
	
	}
	
}