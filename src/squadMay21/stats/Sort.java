package squadMay21.stats;

public class Sort {

	//selection sort
	public static int[] sortArray(int[] arr) {
			
		for(int index=0; index<arr.length-1; index++) {
			
			int lowest = Integer.MAX_VALUE;
			int lowIndex = -1;
			
			for(int i=index; i<arr.length; i++) {
				
				if(arr[i] <= lowest) {
					lowest = arr[i];
					lowIndex = i;
				}
			}
			
			int temp = arr[index];
			arr[index] = arr[lowIndex];
			arr[lowIndex] = temp;
		}
		
		return arr;
	}
}
