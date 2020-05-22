package squadMay21.stats;

import java.util.Arrays;

public class IQRange {
	//a = median of first half
	//b = median of 2nd half
	//iqr = range of a through b
	
	public static int getIQRange(int[] arr) {
		//anything that calls sort needs to use a temp array
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		Sort.sortArray(arr2);
		
		int mid = arr2.length / 2;
		int[] lowArr = Arrays.copyOfRange(arr2, 0, mid);
		int[] hiArr = Arrays.copyOfRange(arr2, mid+1, arr2.length);
		
		int a = Median.getMedian(lowArr);
		int b = Median.getMedian(hiArr);
		
		int x1 = 0;
		while(arr2[x1] <= a) { x1 ++; }
		
		int x2 = arr2.length - 1;
		while(arr2[x2] > b) { x2 --; }
		
		int midArr[] = Arrays.copyOfRange(arr2, x1, x2);
		return Range.getRange(midArr);
		
	}
}
