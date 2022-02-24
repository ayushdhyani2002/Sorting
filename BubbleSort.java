import java.util.*;
public class BubbleSort {

	static void bubbleSort(int array[]) {
	    int size = array.length;
	    
	    // loop for accessing each element in this bsort SE lab program
	    for (int i = 0; i < size - 1; i++)
	    
	      // loop for comparison
	      for (int j = 0; j < size - i - 1; j++)

	        if (array[j] > array[j + 1]) {

	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	        }
	  }

	  public static void main(String args[]) {
	      
	    int[] data = { 76,28,93,0,69,84,-5 };
	    BubbleSort.bubbleSort(data);
	    
	    System.out.println("Sorted Array is:");
	    System.out.println(Arrays.toString(data));
	  }

}
