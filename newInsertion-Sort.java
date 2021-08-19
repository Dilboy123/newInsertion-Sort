
import java.util.Scanner;

public class insertionsort {
		public static void main(String args[]) {
			
			
			int A[] = new int[10];
			int i,j,key,a,k; //declare variables
			Scanner obj = new Scanner(System.in);
			
			//get user input
			System.out.println("Enter the 10 numbres!!\n");
			for(a=0;a<10;a++) {
				System.out.print("Num : "+ (a+1) +" =");
				A[a]=obj.nextInt();
			}
			
			//new insertion-sort algorithm
			for(j=1;j<10;j++) {
				i=0;
				while(A[j]>A[i]) {
					i=i+1;
				}
				key=A[j];
				
				for(k=0;k<=(j-i-1);k++) {
					A[j-k]=A[j-k-1];
				}
				A[i]=key;
			}
			
			//display the A array
			
			System.out.println("\nSorted Array!!\n");
			
			for(a=0;a<10;a++) {
				System.out.println("Num : "+(a+1)+" = "+A[a]);
			}
		
	}
}