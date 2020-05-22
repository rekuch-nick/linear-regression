package squadMay21;

import squadMay21.stats.IQRange;
import squadMay21.stats.LinearReg;
import squadMay21.stats.Mean;
import squadMay21.stats.Median;
import squadMay21.stats.Mode;
import squadMay21.stats.PearsonCoefficient;
import squadMay21.stats.Range;
import squadMay21.stats.Sort;
import squadMay21.stats.StandardDeviation;
import squadMay21.stats.Variance;

public class Main {

	public static void main(String[] args) {
		
		int[] xArr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] yArr = {2, 6, 9, 10, 12, 16, 17, 21};
		
		System.out.print("X : ");
		printArray(xArr);
		System.out.print("Y : ");
		printArray(yArr);
		
		System.out.print("Pearson: ");
		System.out.println(PearsonCoefficient.getPearsonCoefficient(xArr, yArr));
		
		System.out.print("Slope: ");
		System.out.println(LinearReg.getSlope(xArr, yArr));
		
		System.out.print("Y-Intercept: ");
		System.out.println(LinearReg.getIntercept(xArr, yArr));
		
		/*
		System.out.print("Data: ");
		printArray(arr);
		Sort.sortArray(arr);
		System.out.print("Sorted: ");
		printArray(arr);
		
		System.out.println("Mean: " + Mean.getMean(arr));
		System.out.println("Median: " + Median.getMedian(arr));
		System.out.print("Mode: ");
		Mode.printMode(arr);
		System.out.println("Range: " + Range.getRange(arr));
		System.out.println("IQ Range: " + IQRange.getIQRange(arr));
		System.out.println("Variance: " + Variance.getVariance(arr));
		System.out.println("Standard Dev: " + StandardDeviation.getStandardDeviation(arr));
		*/
		

	}
	
	
	
	
	private static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}

}
