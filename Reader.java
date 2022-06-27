package filehandling;
import java.io.*;
import java.util.Scanner;
public class Reader {
	public void Readfile(String name) {
		
		FileReader fr=null;
		Scanner sc=null;
		try {
		File f=new File(name);
		fr=new FileReader(f);
		sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.hasNextLine());
		}
		   }
		catch(FileNotFoundException ff)
		{
			System.out.println("Error"+ ff.getMessage());
		}
		finally {	
			try {
				if(sc!=null)
				{
					sc.close();
				}
				if(fr!=null)
				{
					fr.close();
				}
				System.out.println("Completed....");
			}
			catch(Exception ee){
				System.out.println("Error While closing closing the file"+ee.getMessage());
			} 
		}	
				
	}		
			
}
	
	
	
	
	


