package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
	public static final String MESSAGE="Enter a file Path:";

	public static void readFile(String fileName) {
		
		File file=new File(fileName);
		try {
		 BufferedReader br= new BufferedReader(new FileReader(file));
         String st;
         
         while ((st = br.readLine()) != null)

         System.out.println(st);
     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(ReadingFile.MESSAGE);
             String fileName=sc.nextLine();
             readFile(fileName);
            
             
	}

}
