package mproject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Text1 
{

	public static void main(String[] args) throws Exception  
			
	{	String [][] bbc= new String[1000][1000];
				 File fls = new File("H:\\test.txt");
			        BufferedReader reader = new BufferedReader(new FileReader(fls));
          		  String name = reader.readLine();
          		String str= new Scanner(fls).useDelimiter("\\Z").next();
          		String[][] newtry;
        		long max=str.lines().count();
        		
			            	// String[][] a = new String[(int) max][3];

			            	 for(int i=0; i<max;i++) {
			            		 
			            		 for(int j=0; j<2;j++)
			            		 {
			            		  name = reader.readLine();
								  String [] a = name.split(",");
								  bbc[i][j]=a[i];
								  
								 // System.out.println(Arrays.toString(a[i]).replace("[","").replace("]","").replace(",",""));
								  }
							
			            	
			                 
	}
			            	 reader.close();	          
	}}
	
	

	
	

