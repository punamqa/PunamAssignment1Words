package test.com;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainClass {

	public static File myObj = new File(".\\Files\\wordsmeaning.txt");
	//public static FileReader fileReader = new FileReader(myObj);
	public static String path = myObj.getAbsolutePath();
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//File myObj = new File(".\\Files\\AssignmentWords.xlsx");
		//System.out.println("File name: " + myObj.getName());
	   // System.out.println("Absolute path: " + myObj.getAbsolutePath());
	    
	    FileClass.doesFileExist(path);
	    FileClass.ReadFileandPrint();
	}

}
