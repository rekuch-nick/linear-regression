package squadMay21.stats;

import java.util.Arrays;

public class Median {
	
	
	public static int getMedian(int[] arr) {
		
		//anything that calls sort needs to use a temp array so we don't reorder our actual data
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Sort.sortArray(arr2);
		
		if(arr2.length % 2 == 0) {
			int i = arr2.length / 2;
			int sum = arr2[i] + arr2[i-1];
			return sum / 2;
		} else {
			int i = arr2.length / 2;
			return arr2[i];
		}
		
	}
	
	
	
	
}
