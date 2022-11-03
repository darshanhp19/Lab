package Lab4;

import java.util.Scanner;

public class SortingArray {
	public static void bubbleSort(int[] arr) {   
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
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
		
		bubbleSort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
