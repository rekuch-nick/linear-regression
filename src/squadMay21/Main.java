package squadMay21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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

	static List<Integer> xData;
	static List<Integer> yData;
	
	public static void main(String[] args) {
		
		xData = new ArrayList<>();
		yData = new ArrayList<>();
		
		//readFromFile();
		//int[] xArr = xData.stream().mapToInt(Integer::intValue).toArray();
		//int[] yArr = yData.stream().mapToInt(Integer::intValue).toArray();
		int[] xArr = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] yArr = {1, 2, 3, 4, 5, 6, 7, 8};
		//int[] yArr = {2, 4, 6, 8, 10, 12, 14, 16};		
		
		System.out.print("X : ");
		printArray(xArr);
		System.out.print("Y : ");
		printArray(yArr);
		
		System.out.println();
		System.out.println("X Stats:");
		System.out.println("Mean: " + Mean.getMean(xArr));
		System.out.println("Median: " + Median.getMedian(xArr));
		System.out.print("Mode: ");
		Mode.printMode(xArr);
		System.out.println("Range: " + Range.getRange(xArr));
		System.out.println("IQ Range: " + IQRange.getIQRange(xArr));
		System.out.println("Variance: " + Variance.getVariance(xArr));
		System.out.println("Standard Dev: " + StandardDeviation.getStandardDeviation(xArr));
		
		System.out.println();
		System.out.println("Y Stats:");
		System.out.println("Mean: " + Mean.getMean(yArr));
		System.out.println("Median: " + Median.getMedian(yArr));
		System.out.print("Mode: ");
		Mode.printMode(yArr);
		System.out.println("Range: " + Range.getRange(yArr));
		System.out.println("IQ Range: " + IQRange.getIQRange(yArr));
		System.out.println("Variance: " + Variance.getVariance(yArr));
		System.out.println("Standard Dev: " + StandardDeviation.getStandardDeviation(yArr));
		
		System.out.println();
		
		
		System.out.print("Pearson: ");
		System.out.println(PearsonCoefficient.getPearsonCoefficient(xArr, yArr));
		
		System.out.print("Slope: ");
		System.out.println(LinearReg.getSlope(xArr, yArr));
		
		System.out.print("Y-Intercept: ");
		System.out.println(LinearReg.getIntercept(xArr, yArr));
		
	}
	
	private static void readFromFile() {
		String fileName = "stockdata.csv";
		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			
			
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				
				String[] thisLine = line.split(",");
				
				int yy = (int)Float.parseFloat(thisLine[0]);
				int xx = (int)Float.parseFloat(thisLine[1]);
				
				xData.add( xx );
				yData.add( yy );
			}
			
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("I/O Error");
		}
	}
	
	private static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}

}
