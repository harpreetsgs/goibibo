package mproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Copy 
{
   public static void main(String[] args)throws IOException
   {		
	      File f=new File("H:\\testing.txt");     
	      FileReader fr=new FileReader(f);
	      BufferedReader br=new BufferedReader(fr);
	      String pp= new Scanner(f).useDelimiter("\\Z").next();
			int max=(int) pp.lines().count();
	
	     // int count =(int) br.lines().count();
	      String result[][]=new String[max][3];
	
		 for( int i=0;i<max;i++)
			 {     
			 String str= br.readLine();          
			 String [] pl =str.split(",");
			
			 result[i][0]=pl[0];
			 result[i][1]=pl[1];
			 result[i][2]=pl[2];
	
			System.out.print(result[i][0]+ " ");
			System.out.print(result[i][1]+ " ");
			System.out.print(result[i][2]+ " ");
			System.out.println();
		    }
		    
   }
   }