import java.util.Arrays;

public class Heaps {

public static void siftdown(int[] a, int i) {
        
    	int len = a.length;
    	int tmp = a[i];
    	int index = i;
    
    	while (i < len) {
        
    	    index = i;
            
    	    if (2 * i + 1 < len && tmp > a[2*i + 1])
                index = 2 * i + 1;
            
    	    if (2 * i + 2 < len && tmp > a[2*i + 2] && a[2*i + 1] > a[2*i + 2])
                index = 2 * i + 2;
            
    	    if (i == index) break;
            
    	    
            a[i] = a[index];
            i = index;
        }
        
    	a[index] = tmp;
    }
 
public static void heapify(int[] arr)  {

	for (int i = arr.length / 2 - 1; i >= 0; i--) {
    siftdown(arr, i);
    
	}
	
}

public static void buildHeap(int arr[])
    {
    

        for (int i = 0; i >= 0; i--) {
            heapify(arr);
        }
    }
   
public static void heapSort(int arr[]) {
    
    int size = arr.length;

    for (int i = size / 2 - 1; i >= 0; i--)
        heapify(arr);

  
    for (int i=size-1; i>=0; i--) {

        int x = arr[0];
        arr[0] = arr[i];
        arr[i] = x;

        heapify(arr);
    }
}
 
public static int counter(int[] arr) {
    
    int count = 0;
	
	for (int i = arr.length / 2 - 1; i >= 0; i--) {
siftdown(arr, i);
	count ++;
	
	}    
    
	return count;

    
}


    public static void main(String[] args) {

	
	//Heapify
	int arr1 [] = {4, 2, 1, 8, 6, 5, 10, 9, 11, 16};		
	
	System.out.println("Heapify: ");		
	heapify(arr1);
	
	System.out.println("Number of Comparisons = " + counter(arr1));
	System.out.println(Arrays.toString(arr1) + "\n" );
		
	
	
	//BuildHeap
	int arr2 [] = {12, 10, 15, 19, 8, 7, 20};
	
	System.out.println("Build Heap: ");		
	
	buildHeap(arr2);
	
	System.out.println("Number of Comparisons = " + counter(arr2));
	System.out.println(Arrays.toString(arr2) + "\n" );
			
	
	
	//HeapSort
	int [] arr3 = new int[100];
	
	int min = 1;
	int max = 500;
	
	for (int i = 0; i < 100; i++) {
	    int rand = (int)(Math.random() * (max - min + 1) + min);
	    arr3[i] = rand;
	   
	}
	
	
	System.out.println("Heap Sort: ");		
	
	heapSort(arr3);
	
	System.out.println("Number of Comparisons = " + counter(arr3));
	System.out.println(Arrays.toString(arr3) + "\n" );

	
    }
    
}
