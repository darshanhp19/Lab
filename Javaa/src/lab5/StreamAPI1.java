package lab5;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPI1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		 Function<Integer, Integer> half = a -> a / 2;		  
		 System.out.println(half.apply(num));
		 
		 
		 
		 Predicate<Integer> hasValue = val -> val%2==0;		
		 if(hasValue.test(num))
			 System.out.println("EVEN");
		 else
			 System.out.println("ODD");
		 
		

	}

}
