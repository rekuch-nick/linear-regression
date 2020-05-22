package squadMay21.stats;

public class StandardDeviation {

	
	public static double getStandardDeviation(int arr[]) {
		
		//int avg = Mean.getMean(arr);
		int vari = Variance.getVariance(arr);
		return Math.sqrt((double)vari);
	}
}
