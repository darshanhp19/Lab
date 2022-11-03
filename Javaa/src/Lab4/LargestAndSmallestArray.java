package Lab4;

import java.util.Scanner;

public class LargestAndSmallestArray {
	public static int largest(int[] arr) {
		 int max = arr[0];    
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        return max; 
	}
	
	public static int smallest(int[] arr) {
		 int max = arr[0];    
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] < max)  
	               max = arr[i];  
	        }  
	        return max; 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Largest number is:"+largest(arr));
		System.out.println("Smallest number is:"+smallest(arr));
		

	}

}
