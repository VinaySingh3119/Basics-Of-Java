
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Java_A61_FileHandling {
	public static void main(String[] args) {
		
		System.out.println("Creating a file: ");
		
//		Code to create a new file
		
//		File myFile = new File("VinaySingh.txt");
//		try {
//			myFile.createNewFile();
//		} catch (Exception e) {
//			System.out.println("Unable to create this file:");
//			e.printStackTrace();
//		}
		
//		Code to write to a file
		
//		try {
//			FileWriter fileWrite = new FileWriter("VinaySingh.txt");
//			fileWrite.write("This is our first file on this Java course\n Ok now bye");
//			fileWrite.close();			
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Code for reading a file
		
//		File myFile = new File("VinaySingh.txt");
//		
//		try {
//			Scanner sc = new Scanner(myFile);
//			while(sc.hasNextLine()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//			}
//			sc.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Code for delete a file
		
		File myFile = new File("VinaySingh.txt");
		if(myFile.delete()) {
			System.out.println("I have deleted " + myFile.getName());
		}
		else {
			System.out.println("Some problem accurred while deleting the file:");
		}
		
	}
}
