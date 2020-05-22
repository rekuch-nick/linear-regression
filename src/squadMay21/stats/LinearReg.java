package squadMay21.stats;

public class LinearReg {
	
	public static double getIntercept(int[] xArr, int[] yArr) {
		
		
		double mY = Mean.getMean(yArr);
		double mX = Mean.getMean(xArr);
		double a = getSlope(xArr, yArr);
		
		return mY - (a * mX);
	}
	
	public static double getSlope(int[] xArr, int[] yArr) {
		double r = PearsonCoefficient.getPearsonCoefficient(xArr, yArr);
		double sdX = StandardDeviation.getStandardDeviation(xArr);
		double sdY = StandardDeviation.getStandardDeviation(yArr);
		
		return r * sdY / sdX;
	}
	
}
