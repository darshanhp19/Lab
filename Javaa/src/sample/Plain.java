package sample;

import java.util.Scanner;

public class Plain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			num/=10;
			 rev=(rev*10)+rem;
		}
		if(temp==rev)
		System.out.println("truee");
		else
			System.out.println("fffff");
	}

}
