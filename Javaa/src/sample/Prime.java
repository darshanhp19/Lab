package sample;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean is=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				is=false;
				break;
			}
		}
           if(is) {
        	   System.out.println("prime");
           }else {
        	   System.out.println("not prime");
           }
	}

}
