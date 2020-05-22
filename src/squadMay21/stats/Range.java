package squadMay21.stats;

import java.util.Arrays;

public class Range {
	
	public static int getRange(int[] arr) {
		if(arr.length < 2) { return 0; }
		
		//anything that calls sort needs to use a temp array so we don't reorder our actual data
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Sort.sortArray(arr2);
		int a = arr2[0];
		int b = arr2[arr2.length - 1];
		
		return b - a;
	}
}
