package lab2;

public class StarPattern2 {

	public static void main(String[] args) {
		int i,j,k,row=5;
		for( i=0;i<=row;i++) {
		
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(k=row;k>=j;k--) {
				System.out.print("-");
			}
			System.out.println();
		}
			
		}

	}

