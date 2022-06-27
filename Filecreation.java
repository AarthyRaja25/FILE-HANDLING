package filehandling;
import java.io.*;
public class Filecreation {
	public static void main(String[] args)
	{

		File file = new File("C:\\Users\\USER\\Desktop\\FileHandling\\File1.txt");
		file = new File("C:\\Users\\USER\\Desktop\\FileHandling\\NewFile1.txt");
		boolean present = file.exists();
		System.out.println(present);
		
		if(present == false) {
			try {
				boolean created = file.createNewFile();
				System.out.println("File Created " +created);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
