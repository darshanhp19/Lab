package Lab4;

import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
