package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateWordsArrayList {
	public static void findDuplicates(String string) {
		int count;    
        
        string = string.toLowerCase();    
                
        ArrayList<String> wordArrayList = new ArrayList<String>();
        for(String word : string.split(" ")) {
            wordArrayList.add(word);
        }
 
        System.out.println("Duplicate words in a given strings are : ");     
        for(int i = 0; i < wordArrayList.size(); i++) {    
            count = 1;    
            for(int j = i+1; j < wordArrayList.size(); j++) {    
                if(wordArrayList.get(i).equals(wordArrayList.get(j))) {    
                    count++;       
                    wordArrayList.set(j, "0");   
                }    
            }       
            if(count > 1 && wordArrayList.get(i)!= "0")    
                System.out.println(wordArrayList.get(i));    
        }    
    }    

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		 String string = sc.nextLine();
		 findDuplicates(string);
	        
}
	
}
