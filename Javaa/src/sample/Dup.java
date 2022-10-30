package sample;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vi=-1;
		
		int arr[]=new int[] {3,4,5,1,2,8,9,7,6,5,1,6,7,6,7,7,7,7};
		for(int i=0;i<arr.length;i++) {
			int c=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
					arr[j]=vi;
				}
				
			}
			if( arr[i]!=vi) {
				System.out.println(arr[i]);
			}
		}
	}

}
