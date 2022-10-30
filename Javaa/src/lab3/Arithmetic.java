package lab3;

import java.util.Scanner;

public class Arithmetic {
	public static final String MESSAGE="Enter the values for a and b";
	public static void divide(int a, int b)   
	{  
	int result;  
	try  {  
	result = a / b;  
	System.out.println("Result  is: " + result);  
	}   
	catch(ArithmeticException ex)  {  
	System.out.println("Should avoid dividing by 0 " + ex); 
	ex.printStackTrace();
	}  catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(Arithmetic.MESSAGE);
		int a=sc.nextInt();
		int b=sc.nextInt();
		divide(a, b);
        sc.close();
	}

}
