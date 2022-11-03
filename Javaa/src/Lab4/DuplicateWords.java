package Lab4;

import java.util.Scanner;

public class DuplicateWords {
	 public static void findDupli(String string) {
		 
		 	int count;    
	        string = string.toLowerCase();              
	        String words[] = string.split(" ");    
	            
	        System.out.println("Duplicate words in a given strings are : ");     
	        for(int i = 0; i < words.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count++;       
	                    words[j] = "0";    
	                }    
	            }       
	            if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	        }    
	    }    
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		 String string = sc.nextLine();
		 findDupli(string);
		 sc.close();
		 
	}
}