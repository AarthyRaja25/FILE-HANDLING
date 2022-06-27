package filehandling;
import java.io.File;
public class Filedeletion {
public static void main(String[] args)
{
	File file = new File("C:\\Users\\USER\\Desktop\\aarthy\\newFile1.txt");
	file.delete();
	boolean present=file.exists();
	System.out.println(present);
	
	
	
	
	
}
	
	
	
	

}
