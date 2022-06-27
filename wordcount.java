package filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class wordcount {
public static void main(String[] args)
{
	
	try {
		File file=new File("C:\\Users\\USER\\Desktop\\FileHandling\\File1.txt");
			Scanner scanner=new Scanner( file);
			int wordcount=0;
			while(scanner.hasNextLine())
			{
		//String words
			System.out.println(scanner.nextLine());	
			wordcount++;
			
			}
			System.out.println("TOTAL NUMBER OF LINES"+wordcount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
}
}
