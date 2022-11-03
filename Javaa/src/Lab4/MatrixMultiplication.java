package Lab4;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void multiply(int arr1[][],int arr2[][]) {
		int arr3[][]=new int[arr1.length][arr2.length];  
	    
		for(int i=0;i<arr1.length;i++){    
			for(int j=0;j<arr2.length;j++){    
				arr3[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					arr3[i][j]+=arr1[i][k]*arr2[k][j];      
				} 
				System.out.print(arr3[i][j]+" ");   
			} 
		System.out.println();   
		}    
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		
		System.out.println("Enter array1 elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter array2 elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		    multiply(arr1, arr2);
		   
		

	}

}
