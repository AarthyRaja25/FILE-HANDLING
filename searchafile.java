package filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class searchafile {
	public static void main(String[] args)
	{
		File file=new File("C:\\Users\\USER\\Desktop\\FileHandling\\File1.txt");
		
		try {
			Scanner scanner=new Scanner(file);
			String word="ZOHOBOOK";
			   String s;
			   int wordCount=0;
			   int lineCount=0;
			   int totalWords=0;  
			   String [] words=null;
			 while((s=scanner.nextLine())!=null) {
			   words=s.split(" ");
			   for(String spilit : words) {
			   totalWords++;
			   }
			   }
			        System.out.println("\ntotalwords is "+totalWords);
			        System.out.println();
			   while((s=scanner.nextLine())!=null) {
			   words=s.split(" ");
			   lineCount++;
			   for(String spilt : words) {
			     if(spilt.equals(word)) {
			   System.out.println(s);
			  
			     }
			    } 
			   }
	

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		
	}

}
