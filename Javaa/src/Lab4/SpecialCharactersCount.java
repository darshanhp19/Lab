package Lab4;

import java.util.Scanner;

public class SpecialCharactersCount {
	public static void specialChar(String str) {
		for(int i=0;i<str.length();i++) {
        	if(!(str.charAt(i)>='a' && str.charAt(i)<='z') && str.charAt(i)!=' ' && !(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='0'&& str.charAt(i)<='9')) {
        		System.out.print(str.charAt(i));
        	}
        }
	}

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		 String string = sc.nextLine();
		 specialChar(string);
	}

}
