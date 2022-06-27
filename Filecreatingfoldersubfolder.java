package filehandling;
import java.io.*;
public class Filecreatingfoldersubfolder {
public static void main(String[] args)
{
File file=new File("C:\\Users\\USER\\Desktop\\FileHandling\\aarthy\\sruthi");	
	boolean present=file.exists();
	System.out.println("folder present  :"+present);
	if(present==false)
	{
		file.mkdirs();
		//present=file.exists();
	}
	present=file.exists();
	System.out.println("folder  :"+present);
	
}
}
