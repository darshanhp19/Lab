package lab2;

import java.util.Scanner;

public class ReverseString {
	public static void reverse(String str) {
		 for (int i=str.length()-1; i>=0; i--)
	      {
	       System.out.print(str.charAt(i));
	      }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		 String str=sc.next();     
	     reverse(str);
	     sc.close();
	    }
	}
        


