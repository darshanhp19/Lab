package lab2;

import java.util.Scanner;

public class DecimalToBinary {
	static void  toBinary(int num)
	{
	   int i = 0;    
	   int  bin[]=new int[100]; 
	    bin[0]=0;
	   while(num>0)
	    {
	    bin[i++] = num%2;
	    num = num/2;
	    } 
	    for(int j =i-1;j >= 0;j--)
	    {
	       System.out.print(bin[j]);
	    }
}
	
	public static int toDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	  }

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a binary number");
		    long n=sc.nextLong();
		    System.out.print("Decimal number is : ");
		    System.out.println(toDecimal(n));
		    System.out.print("Binary  number is : ");
		    toBinary(toDecimal(n));
		   
		  
		   
		}
		
}
