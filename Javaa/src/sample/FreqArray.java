package sample;

public class FreqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {4,3,3,6,7,6,9,4,1};
int fr[]=new int[arr.length];
int vi=-1;

for(int i=0;i<arr.length;i++) {
	int count=1;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
			fr[j]=vi;
		}
		
		
		
	}
	
	if(fr[i]!=-1) {
		fr[i]=count;
	}
}

for(int i = 0; i < fr.length; i++){  
    if(fr[i] != vi)  
        System.out.println("    " + arr[i] + "    |    " + fr[i]);  
}  
	}

}
