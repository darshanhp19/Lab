package lab2;

import java.util.Scanner;

public class CentreAligned {

	public static void main(String[] args) {
	       
	        int rows = 6;
	 
	        for (int i = 1; i <= rows; i++) {
	        
	            for (int j = rows; j >= i; j--) {
	                System.out.print(" ");
	            } 
	           
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }    
	            System.out.println();
	        }

	}

}
