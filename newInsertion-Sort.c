#include <stdio.h>
int main(){
	
	int A[10],j,key,k,i,a;//variable and array declaration
	
	//get values and assign to the array
	printf("\nEnter 10 numbers!!\n\n");
	for(a=0;a<10;a++){
		printf("Enter number A[%d] :",a+1);
		scanf("%d",&A[a]);
	}

	//new insertion sort
	
	for(j=1;j<10;j++){
		i=0;

		while(A[j] > A[i]){
			i = i + 1;
		}

		key = A[j];

		for(k=0;k<=(j-i-1);k++){
			A[j-k]=A[j-k-1];

		}

		A[i]=key;
			
	}

	//display the sorted arra
	
	printf("\nThe sorted array!!\n\n");

	for(a=0;a<10;a++){
		printf("A[%d] = %d\n",a+1,A[a]);
	}

	return 0;

}
