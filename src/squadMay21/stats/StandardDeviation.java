package squadMay21.stats;

public class StandardDeviation {

	
	public static double getStandardDeviation(int arr[]) {
		
		double vari = Variance.getVariance(arr);
		return Math.sqrt(vari);
	}
}
