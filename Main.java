package saurabh;

import java.util.Scanner;

public class Main {

    // Searching Algorithm
	// Linear Search
	Scanner in = new Scanner(System.in);
	static int linearSearch(int[] arr, int target){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == target){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] arr= {10,20,30,50,70,90}; 
	int target =  in.nextInt();    
        System.out.println(key+" is found at index: "+linearSearch(arr, target));    
    }    
	
	
	
	// Binary Search
	
	 public static void binarySearch(int arr[], int first, int last, int key){  
   	int mid = (first + last)/2;  
   	while( first <= last ){  
      	if ( arr[mid] < key ){  
        	first = mid + 1;     
      	}else if ( arr[mid] == key ){  
        	System.out.println("Element is found at index: " + mid);  
        	break;  
      	}else{  
         	last = mid - 1;  
      	}  
      	mid = (first + last)/2;  
   	}  
   	if ( first > last ){  
      	System.out.println("Element is not found!");  
   	}  
 	}  
 	public static void main(String args[]){  
        	int arr[] = {10,20,30,40,50};  
        	int key = 30;  
       		int last=arr.length-1;  
        	binarySearch(arr,0,last,key);     
 	}  
}
