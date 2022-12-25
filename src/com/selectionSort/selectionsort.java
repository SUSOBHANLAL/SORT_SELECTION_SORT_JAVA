package com.selectionSort;

public class selectionsort {
	public static void main(String args[]) {
	    int[] array = { 20, 12, 10, 15, 2 };

		    int size = array.length;

		    for (int i = 0; i < size; i++) {
		   

		      for (int j = i + 1; j < size; j++) {

		        if (array[j] < array[i]) {
		          
		        // swap 
		      int temp = array[i];
		      array[i] = array[j];
		      array[j] = temp;
		        }
		    }
		  }
		    for (int i = 0; i < size; i++) {
			    System.out.print(array[i]+" ");
		    }
		    
		  

}
}
	 
	
