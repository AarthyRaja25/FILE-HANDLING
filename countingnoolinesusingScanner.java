package filehandling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class countingnoolinesusingScanner {
	public  static void main(String[] args){
		
try {
	FileWriter filewriter=new FileWriter("C:\\Users\\USER\\Desktop\\FileHandling\\File1.txt");
	filewriter.write("ZOHOPRODUCTS LIST"+"\n");
	filewriter.write("ZOHOBOOKS"+"\n");

	filewriter.write("ZOHOPEOPLE"+"\n");
	filewriter.write("ZOHOCRM"+"\n");
	filewriter.write("ZOHOMEET"+"\n");
	filewriter.write("ZOHOCLIQ"+"\n");
    filewriter.write("ZOHOONE");
    System.out.println("FILE COMPLETED");
    filewriter.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}







}
}