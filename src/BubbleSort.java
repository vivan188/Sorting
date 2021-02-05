import java.util.*;
public class BubbleSort{
	static void bubbleSort(int[] arr,int n) {
		int t = 0;
		for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            t = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = t;  
                    }        
            }  
      }  
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for (int i=0; i<n; i++){  
		System.out.println(array[i]);  
		} 
		
		bubbleSort(array,n);
		
		System.out.println("Array after bubble sort");
		for (int i=0; i<n; i++){  
			System.out.println(array[i]);  
			} 
		sc.close();
	}

}
