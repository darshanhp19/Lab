package sample;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		int n1=0,n2=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(n1+" "+n2);
		for(int i=2;i<num;i++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
