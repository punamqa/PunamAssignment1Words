package test.com;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileClass {

	public static void doesFileExist(String path) {
		try {
			// System.out.println(MainClass.myObj.getAbsolutePath());
			if (MainClass.myObj.exists()) {
				System.out.println("File exists at the path" + path);

			} else {
				throw new FileNotFoundException();
			}
			MainClass.myObj.getAbsoluteFile();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Looks like file does not exists");
			// e.printStackTrace();
		}
	}

	// public static void ReadFileandPrint() throws IOException{
	//
	// try (BufferedReader bufferedReader = new
	// BufferedReader(MainClass.fileReader)) {
	// String line;
	// while((line = bufferedReader.readLine()) != null) {
	// System.out.println(line);
	// }
	// }
	//
	//
	//
	// }

	public static void ReadFileandPrint() throws FileNotFoundException {

		Scanner sc = new Scanner(MainClass.myObj);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			//System.out.println(line);
			//String line = sc.nextLine();
			//String[] words = line.split("\\s");// splits the string based on
			//String[] words = line.split(",");	
			String[] words = line.split("–");	// whitespace
			// using java foreach loop to print elements of string array
			for (String w : words) {
				String[] words2 = w.split(",");
				for (String w2 : words2){
				System.out.println(w2);
				}
			}

		}

	}

}
