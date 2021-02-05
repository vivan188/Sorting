import java.util.Scanner;

public class InsertionSort {  
    public static void insertionSort(int array[],int n) {    
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
    	int n;
    	System.out.println("Enter length of the array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for (int i=0; i<n; i++){  
		System.out.print(array[i]+" ");  
		} 
		System.out.println();
		insertionSort(array,n);
		
		System.out.println("Array after Insertion sort");
		for (int i=0; i<n; i++){  
			System.out.print(array[i] + " ");  
		} 
		sc.close();
    }    
}    
