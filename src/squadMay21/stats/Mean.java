package squadMay21.stats;

public class Mean {
	
	public static double getMean(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		
		return sum / arr.length;
	}
	
}
