package filehandling;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class readingfileusingscanner {
	void display()
	{
		try {
		File file=new File("C:\\Users\\USER\\Desktop\\FileHandling\\File1.txt");
			Scanner scanner=new Scanner( file);
			int linecount=0;
			while(scanner.hasNextLine())
			{
		
			System.out.println(scanner.nextLine());	
			linecount++;
			//System.out.println(linecount);
			}
			System.out.println("TOTAL NUMBER OF LINES"+linecount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
