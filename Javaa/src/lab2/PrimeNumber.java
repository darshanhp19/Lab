package lab2;

import java.util.Scanner;

public class PrimeNumber {
	public static void checkPrime(int number) {
		boolean isPrime=true;
		for(int i=2;i<=number/2;i++) {
			if(number % i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number+" is a prime Number");
		}else {
			System.out.println(number+" is not a prime Number");
		}
	}

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(number>0)
		checkPrime(number);
		else
			throw new IllegalArgumentException();
		
	}

}
