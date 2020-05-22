package squadMay21.stats;

public class PearsonCoefficient {
	
	/*
	 * 
	 * r = n(sumXY) - (sumX)(sumY)
	 *      ______________________ 
	 *    sqrt (((n * (SumXX))  - ((SumX)^2)) * ( (n * (SumYY)) - (SumY)^2
	 * 
	 */
	
	public static double getPearsonCoefficient(int[] xArr, int[] yArr) {
		int len = xArr.length;
		int sumX = Sum.getSum(xArr);
		int sumY = Sum.getSum(yArr);
		int sumXY = Sum.getTimesSum(xArr, yArr);
		int sumXX = Sum.getSquareSum(xArr);
		int sumYY = Sum.getSquareSum(yArr);
		
		int top = (len * sumXY) - (sumX * sumY);
		int botLeft = (len * sumXX) - (sumX * sumX);
		int botRight = (len * sumYY) - (sumY * sumY);
		int bot = botLeft * botRight;
		
		return top / Math.sqrt(bot);
		
		
	}
}
