package squadMay21.stats;

public class Variance {

	
	public static double getVariance(int[] arr) {
		double avg = Mean.getMean(arr);
		int v = 0;
		for(int n : arr) {
			v += (n - avg)*(n - avg);
		}
		return v / arr.length;
	}
}
