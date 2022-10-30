package lab2;

import java.util.Scanner;

public class FibonacciSeries {
	public static void printFibonacci(int number) {
		int i = 1,  first = 0, second = 1;
	    System.out.println("Fibonacci Series till " + number );

	    while (i <= number) {
	      System.out.print(first + ", ");

	      int next = first + second;
	      first = second;
	      second = next;

	      i++;
	    }
	}

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(number>0) {
			printFibonacci(number);
		}else {
			throw new IllegalArgumentException();
			
		}
		
	}
	
}
