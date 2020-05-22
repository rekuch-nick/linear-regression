package squadMay21.stats;

public class Sum {
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	public static int getSquareSum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i*i;
		}
		return sum;
	}
	
	public static int getTimesSum(int[] xArr, int[] yArr) {
		int sum = 0;
		for(int i=0; i<xArr.length; i++) {
			sum += (xArr[i] * yArr[i]);
		}
		return sum;
	}
}
